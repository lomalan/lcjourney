package binarysearch;

public class Koko {
    public int minEatingSpeed(int[] piles, int h) {
        // Phase 1. Calculate max bananas in pile
        int right = 0;
        for (int bananas: piles) {
            right = Math.max(bananas, right);
        }
        // Phase 2. Binary search through bananas and finding a k
        int left = 1;
        int k = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            // Needed for cases with some big numbers
            long actualHours = 0;
            for (int pile: piles) {
                actualHours += Math.ceilDiv(pile, mid);
            }
            if (actualHours <= h) {
                k = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return k;
    }
}
