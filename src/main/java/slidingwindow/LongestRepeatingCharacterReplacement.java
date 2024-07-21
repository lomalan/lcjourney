package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] characterAppearances = new int[26];
        int left = 0;
        int localMax = 0;
        int result = 0;
        var sArray = s.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            characterAppearances[getUpperCaseCharacterPosition(sArray[i])]++;
            localMax = Math.max(localMax, characterAppearances[getUpperCaseCharacterPosition(sArray[i])]);
            if ((i - left + 1) - localMax > k) {
                // remove the appearance of the most left character and move left pointer
                characterAppearances[getUpperCaseCharacterPosition(sArray[left])]--;
                left++;
            }
            // calculate max
            result = Math.max(i - left + 1, result);
        }
        return result;
    }

    // To put object in a right position we need to subtract 'A', because
    // the int value of 'A' is 65, so it will not fit in our array[26]
    // But if we subtract 'A' if character for example 'A' it will put it on a zero index
    private int getUpperCaseCharacterPosition(char c) {
        return c - 'A';
    }

    public int characterReplacementMap(String s, int k) {
        Map<Character, Integer> characterAppearances = new HashMap<>();
        int left = 0;
        int localMax = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            var currentChar = s.charAt(i);
            characterAppearances.put(currentChar, characterAppearances.getOrDefault(currentChar, 0) + 1);
            localMax = Math.max(localMax, characterAppearances.get(currentChar));
            if ((i - left + 1) - localMax > k) {
                // remove the appearance of the most left character and move left pointer
                char mostLeftChar = s.charAt(left);
                characterAppearances.put(mostLeftChar, characterAppearances.get(mostLeftChar) - 1);
                left++;
            }
            // calculate max
            result = Math.max(i - left + 1, result);
        }
        return result;
    }
}
