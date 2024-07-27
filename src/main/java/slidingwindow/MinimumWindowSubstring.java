package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        // Phase 1 init map for t
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            var currChar = t.charAt(i);
            int charAppearance = tMap.getOrDefault(currChar, 0) + 1;
            tMap.put(currChar, charAppearance);
        }
        // Phase 2 populate map for s and initialise
        Map<Character, Integer> sMap = new HashMap<>();
        int have = 0;
        int need = t.length();
        int result = Integer.MAX_VALUE;
        var resultIndexes = new int[2];
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            var currChar = s.charAt(r);
            int charAppearance = sMap.getOrDefault(currChar, 0) + 1;
            sMap.put(currChar, charAppearance);
            if (tMap.containsKey(currChar) && sMap.get(currChar) <= tMap.get(currChar)) {
                have++;
            }
            while (have == need && l < s.length()) {
                var currentRes = r - l + 1;
                if (currentRes < result) {
                    result = currentRes;
                    resultIndexes[0] = l;
                    resultIndexes[1] = r + 1;
                }
                var charToDecrease = s.charAt(l);
                sMap.put(charToDecrease, sMap.get(charToDecrease) - 1);
                if (tMap.containsKey(charToDecrease) && sMap.get(charToDecrease) < tMap.get(charToDecrease)) {
                    have--;
                }
                l++;
            }
        }

        if (result == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(resultIndexes[0], resultIndexes[1]);
    }

    public String minWindowList(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        // Phase 1 init map for t
        var tMap = new int[58]; // because 'z' - 'A' = 57, z should be the last allowed character
        for (int i = 0; i < t.length(); i++) {
            var currChar = t.charAt(i);
            tMap[currChar - 'A']++;
        }
        // Phase 2 populate map for s and initialise
        var sMap = new int[52];
        int have = 0;
        int need = t.length();
        int result = Integer.MAX_VALUE;
        var resultIndexes = new int[2];
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            var currChar = s.charAt(r);
            sMap[currChar - 'A']++;
            if (sMap[currChar - 'A'] <= tMap[currChar - 'A']) {
                have++;
            }
            while (have == need && l < s.length()) {
                var currentRes = r - l + 1;
                if (currentRes < result) {
                    result = currentRes;
                    resultIndexes[0] = l;
                    resultIndexes[1] = r + 1;
                }
                var charToDecrease = s.charAt(l);
                sMap[charToDecrease - 'A']--;
                if (sMap[charToDecrease - 'A'] < tMap[charToDecrease - 'A']) {
                    have--;
                }
                l++;
            }
        }

        if (result == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(resultIndexes[0], resultIndexes[1]);
    }
}
