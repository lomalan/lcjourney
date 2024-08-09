package twopointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // phase 1. Make string to lowercase (to avoid any problems in comparison)
        var lowerCaseCharArray = s.toLowerCase().toCharArray();
        // phase 2. Init left and right pointer in the beginning and end of the string
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            var leftChar = lowerCaseCharArray[left];
            //Process only if left and right chars are alphabetic
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            var rightChar = lowerCaseCharArray[right];
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
