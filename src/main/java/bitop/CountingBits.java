package bitop;

public class CountingBits {
   public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            // i / 2 is the same as i >> 1 and i % 2 is the same as (i & 1)
            res[i] = res[i / 2] + (i % 2);
        }
        return res;   
    } 
    
    public int[] countBitsBruteForce(int n) {
        // The main idea of brute forse is 
        // to go through each number find a remainder 
        // and shrink it until it's 0
        int[] res = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            int j = i;
            var ones = 0;
            while(j != 0) {
                ones += j % 2;
                j /= 2;
            }
            res[i] = ones;
        }
        return res;   
    } 
}
