package DP;
import java.util.*;

public class LongestIncreasingSubsequence {

    // DP O(n²) Approach
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLen = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }



    // Optimized – Binary Search + Greedy (O(n log n))
    public static int LIS(int[] nums) {
        List<Integer> sub = new ArrayList<>();

        for (int num : nums) {
            int i = Collections.binarySearch(sub, num);
            if (i < 0) i = -(i + 1);  // insertion point
            if (i == sub.size()) {
                sub.add(num);  // extend LIS
            } else {
                sub.set(i, num);  // replace
            }
        }
        return sub.size();
    }
}
