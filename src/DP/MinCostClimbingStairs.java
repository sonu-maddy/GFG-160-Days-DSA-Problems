package DP;

public class MinCostClimbingStairs {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n = cost.length;
        int[] minCost = new int[n+1];

        for(int i = 2; i<=n; i++){
            minCost[i] = Math.min((cost[i-1] + minCost[i-1]), (cost[i-2] + minCost[i-2]));
        }

        return minCost[n];
    }
}

//Given an array of integers cost[] where cost[i] is the cost of the ith step on a staircase. Once the cost is paid, you can either climb one or two steps. Return the minimum cost to reach the top of the floor.
//        Assume 0-based Indexing. You can either start from the step with index 0, or the step with index 1.
//
//Examples:
//
//Input: cost[] = [10, 15, 20]
//Output: 15
//Explanation: Cheapest option is to start at cost[1], pay that cost, and go to the top.
//
//
//
//        Input: cost[] = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
//Output: 6
//Explanation: Cheapest option is to start on cost[0], and only step on 1s, skipping cost[3].
//
//
//Constraints:
//        2 ≤ cost.size() ≤ 105
//        0 ≤ cost[i] ≤ 999
