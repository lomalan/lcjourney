package slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        var max = 0;
        var l = 0;
        var uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            var currValue = s.charAt(i);
            while (uniqueChars.contains(currValue)) {
                uniqueChars.remove(s.charAt(l));
                l++;
            }
            uniqueChars.add(currValue);
            max = Math.max(i - l + 1, max);
        }
        return max;
    }

    // Can be done the same but using map
    public int lengthOfLongestSubstringOpt(String s) {
        int result = 0;
        int l = 0;
        int[] cache = new int[256];
        for (int i = 0; i < s.length(); i++) {
            var currentChar = s.charAt(i);
            var charPosition = cache[currentChar];
            if (cache[currentChar] > 0) {
                l = Math.max(l, charPosition);
            }
            cache[currentChar] = i + 1;
            result = Math.max(result, i - l + 1);
        }
        return result;
    }

    public int lengthOfLongestSubstringMap(String s) {
        var max = 0;
        var l = 0;
        Map<Character, Integer> charPositionMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            var currentChar = s.charAt(i);
            if(charPositionMap.containsKey(currentChar)) {
                l = charPositionMap.get(currentChar);
            }
            charPositionMap.put(currentChar, i + 1);
            max = Math.max(i - l + 1, max);
        }
        return max;
    }
}
