package DP;

public class WaysReachTheNthStair {
    int countWays(int n) {
        // 1st ways
        // if(n == 1) return 1;
        // int[] dp = new int[n+1];

        // dp[1] = 1;
        // dp[2] = 2;

        // for(int i = 3; i<=n; i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }

        // return dp[n];

        // 2nd ways
        // int ans = 0;
        // if(n==0) return 0;
        // if(n ==1) return 1;
        // if(n == 2) return 2;

        // ans = countWays(n-1) + countWays(n-2);

        // return ans;

        //3rd ways

        if(n <= 2) return n;
        int first =1;
        int second =2;
        int result =0;

        for(int i =3; i<=n; i++){
            result = first + second;
            first = second;
            second = result;
        }

        return result;



    }
}

//There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Your task is to count the number of ways, the person can reach the top (order does matter).
//
//Examples:
//
//Input: n = 1
//Output: 1
//Explanation: There is only one way to climb 1 stair.
//        Input: n = 2
//Output: 2
//Explanation: There are 2 ways to reach 2th stair: {1, 1} and {2}.
//Input: n = 4
//Output: 5
//Explanation: There are five ways to reach 4th stair: {1, 1, 1, 1}, {1, 1, 2}, {2, 1, 1}, {1, 2, 1} and {2, 2}.
//Constraints:
//        1 ≤ n ≤ 44


