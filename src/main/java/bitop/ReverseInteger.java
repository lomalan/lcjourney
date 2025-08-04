package bitop;

public class ReverseInteger {

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            res = (res * 10) + digit;   
        }
        return res;   
    }

    public int reverseWithLong(int x) {
        long res = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            res = (res * 10) + digit;
        }
        // check overflow
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) res;
    }
}
