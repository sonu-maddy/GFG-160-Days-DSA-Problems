package DP;

public class SubsetSumProblem {
    static Boolean[][] dp;
    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        dp = new Boolean[n][sum+1];
        return helper(arr, sum, 0);
    }
    static Boolean helper(int arr[], int sum,int i){
        int n = arr.length;


        if(sum ==0){
            return true;
        }

        if(i == n){
            return false;
        }

        if(dp[i][sum] != null){
            return dp[i][sum];
        }

        boolean pick = false;
        if(arr[i] <= sum) {
            pick = helper(arr, sum - arr[i], i+1);
        }

        boolean nopick = helper(arr, sum , i+1);

        dp[i][sum] = (pick || nopick);
        return dp[i][sum];
    }
}



//Given an array of positive integers arr[] and a value sum, determine if there is a subset of arr[] with sum equal to given sum.
//
//Examples:
//
//Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 9
//Output: true
//Explanation: Here there exists a subset with target sum = 9, 4+3+2 = 9.
//Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 30
//Output: false
//Explanation: There is no subset with target sum 30.
//Input: arr[] = [1, 2, 3], sum = 6
//Output: true
//Explanation: The entire array can be taken as a subset, giving 1 + 2 + 3 = 6.
//Constraints:
//        1 <= arr.size() <= 200
//        1<= arr[i] <= 200
//        1<= sum <= 104
