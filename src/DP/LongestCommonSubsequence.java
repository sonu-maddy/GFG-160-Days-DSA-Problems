package DP;

public class LongestCommonSubsequence {

    // using recursion........

//    static int lcs(String s1, String s2) {
//        return solve(s1, s2,0, 0);
//    }
//
//    private static int solve(String s1, String s2, int i, int j) {
//        if(i == s1.length()){
//            return 0;
//        }
//        if(j == s2.length()){
//            return 0;
//        }
//        int ans = 0;
//        if(s1.charAt(i) == s2.charAt(j)){
//            ans = 1 + solve(s1, s2, i+1, j+1);
//        }
//        else{
//             ans = Math.max(solve(s1, s2, i+1, j), solve(s1, s2, i, j+1));
//        }
//        return ans;
//    }

    // using top-down(Memoization).........

    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];

        // initialize dp with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(s1, s2, 0, 0, dp);
    }

    private static int solve(String s1, String s2, int i, int j, int[][] dp) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + solve(s1, s2, i + 1, j + 1, dp);
        } else {
            dp[i][j] = Math.max(
                    solve(s1, s2, i + 1, j, dp),
                    solve(s1, s2, i, j + 1, dp)
            );
        }

        return dp[i][j];
    }

    // Tabulation (Bottom-Up)............

//    static int lcs(String s1, String s2) {
//        int n = s1.length();
//        int m = s2.length();
//
//        // Create DP table
//        int[][] dp = new int[n + 1][m + 1];
//
//        // Bottom-up filling
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
//                    // Characters match → extend LCS by 1
//                    dp[i][j] = 1 + dp[i - 1][j - 1];
//                } else {
//                    // Characters don't match → take best of excluding one
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//                }
//            }
//        }
//
//        return dp[n][m]; // Final answer at bottom-right corner
//    }

    public static void main(String[] args) {
       String s1 = "ABCDGH", s2 = "AEDFHR";
        System.out.println(lcs(s1, s2));
    }
}
