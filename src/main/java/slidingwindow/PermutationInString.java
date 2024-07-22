package slidingwindow;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        var s1Storage = new int[26];
        var s2Storage = new int[26];

        // phase 1 populate first multiple values
        for (int i = 0; i < s1.length(); i++) {
            s1Storage[s1.charAt(i) - 'a']++;
            s2Storage[s2.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = s1.length() - 1;
        while (right < s2.length() - 1) {
            if (Arrays.equals(s1Storage, s2Storage)) {
                return true;
            }
            s2Storage[s2.charAt(left) - 'a']--;
            left++;
            right++;
            s2Storage[s2.charAt(right) - 'a']++;
        }
        return Arrays.equals(s1Storage, s2Storage);
    }
}
