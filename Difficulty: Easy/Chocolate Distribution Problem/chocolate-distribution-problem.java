import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // Sort the array
        Collections.sort(arr);

        int n = arr.size();
        if (m == 0 || n == 0) return 0; // edge case
        if (m > n) return -1; // invalid case

        int minDiff = Integer.MAX_VALUE;

        // Slide over sorted array with window size m
        for (int i = 0; i <= n - m; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
