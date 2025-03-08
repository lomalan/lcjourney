package greedy;

public class Parenthesis {
    public boolean checkValidString(String s) {
        int leftMin = 0;
        int leftMax = 0;

        for (char character: s.toCharArray()) {
           if (character == ')') {
                leftMin--;
                leftMax--;
           } else if (character == '(') {
                leftMin++;
                leftMax++;
           } else {
                leftMax++;
                leftMin--;
           }
           if (leftMax < 0) {
                return false;
           }
           if (leftMin < 0) {
                leftMin = 0;
           }
        }
        return leftMin == 0;   
    }
}
