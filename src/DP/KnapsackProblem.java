package DP;
import java.util.Arrays;

public class KnapsackProblem {
    static int[][] dp = new int[1001][1001];


    static int knapsack(int W, int val[], int wt[]) {
        // code here
        for(int i =0; i<dp[0].length;i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(W, val, wt, 0);
    }
    static int solve(int W, int val[], int wt[], int i){
        if(i >= wt.length || W <= 0){
            return 0;
        }

        int pick = 0;
        if(dp[i][W] != -1) return dp[i][W];
        if(wt[i] <= W){
            pick = val[i] + solve(W-wt[i], val, wt, i+1);
        }


        int noPick = solve(W, val, wt, i+1);

        return dp[i][W] = Math.max(pick, noPick);


    }
}



//0 - 1 Knapsack Problem
//Difficulty: MediumAccuracy: 31.76%Submissions: 532K+Points: 4
//Given n items, each with a specific weight and value, and a knapsack with a capacity of W, the task is to put the items in the knapsack such that the sum of weights of the items <= W and the sum of values associated with them is maximized.
//
//        Note: You can either place an item entirely in the bag or leave it out entirely. Also, each item is available in single quantity.
//
//        Examples :
//
//Input: W = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1]
//Output: 3
//Explanation: Choose the last item, which weighs 1 unit and has a value of 3.
//Input: W = 3, val[] = [1, 2, 3], wt[] = [4, 5, 6]
//Output: 0
//Explanation: Every item has a weight exceeding the knapsack's capacity (3).
//Input: W = 5, val[] = [10, 40, 30, 50], wt[] = [5, 4, 2, 3]
//Output: 80
//Explanation: Choose the third item (value 30, weight 2) and the last item (value 50, weight 3) for a total value of 80.
//Constraints:
//        2 ≤ val.size() = wt.size() ≤ 103
//        1 ≤ W ≤ 103
//        1 ≤ val[i] ≤ 103
//        1 ≤ wt[i] ≤ 103


