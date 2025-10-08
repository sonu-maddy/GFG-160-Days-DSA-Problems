package DP;

public class PartitionEqualSubsetSum {
    static boolean equalPartition(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i =0; i<n; i++) sum += arr[i];

        if(sum % 2 != 0) return false;

        int target = sum/2;

        boolean[]dp = new boolean[target+1];
        dp[0] = true;

        for(int num : arr){
            for(int j = target; j >= num; j--){
                dp[j] = dp[j] || dp[j-num];
            }
        }

        return dp[target];
    }
}


//Given an array arr[], determine if it can be partitioned into two subsets such that the sum of elements in both parts is the same.
//
//        Note: Each element must be in exactly one subset.
//
//Examples:
//
//Input: arr = [1, 5, 11, 5]
//Output: true
//Explanation: The two parts are [1, 5, 5] and [11].
//Input: arr = [1, 3, 5]
//Output: false
//Explanation: This array can never be partitioned into two such parts.
//Constraints:
//        1 ≤ arr.size ≤ 100
//        1 ≤ arr[i] ≤ 200


