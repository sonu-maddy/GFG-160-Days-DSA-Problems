package DP;

public class LongestPalindromicSubsequence {
    public int longestPalinSubseq(String s) {
        // code here
        int n = s.length();
        int[][] dp = new int[n][n];

        for(int i =0; i < n; i++){
            dp[i][i] = 1;
        }

        for(int len = 2; len <= n; len++){
            for(int i =0; i<=n-len; i++){
                int j = i + len -1;
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 2 + (i+1 <= j-1 ? dp[i+1][j-1] : 0);
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}

//Given a string s, return the length of the longest palindromic subsequence.
//
//A subsequence is a sequence that can be derived from the given sequence by deleting some or no elements without changing the order of the remaining elements.
//
//A palindromic sequence is a sequence that reads the same forward and backward.
//
//        Examples:
//
//Input: s = "bbabcbcab"
//Output: 7
//Explanation: Subsequence "babcbab" is the longest subsequence which is also a palindrome.
//        Input: s = "abcd"
//Output: 1
//Explanation: "a", "b", "c" and "d" are palindromic and all have a length 1.
//Input: s = "agbdba"
//Output: 5
//Explanation: The longest palindromic subsequence is "abdba", which has a length of 5. The characters in this subsequence are taken from the original string "agbdba", and they maintain the order of the string while forming a palindrome.
//        Constraints:
//        1 ≤ s.size() ≤ 1000
//The string contains only lowercase letters.
//
//
