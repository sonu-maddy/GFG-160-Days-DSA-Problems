package DP;

public class LongestPalindromeInAString {
    static String longestPalindrome(String s) {
        // code here
        int n = s.length();
        if(n ==0){
            return "";
        }

        boolean[][] dp = new boolean[n][n];
        int start =0, maxLength =1;

        for(int i =0; i<n ;i++){
            dp[i][i] = true;
        }

        for(int i =0; i< n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for(int len =3; len <= n; len++){
            for(int i =0; i<= n-len; i++){
                int j = i+len-1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    if(len > maxLength){
                        start =i;
                        maxLength = len;
                    }
                }
            }
        }

        return s.substring(start, start+maxLength);
    }
}

//Given a string s, your task is to find the longest palindromic substring within s.
//
//A substring is a contiguous sequence of characters within a string, defined as s[i...j] where 0 ≤ i ≤ j < len(s).
//
//A palindrome is a string that reads the same forward and backward. More formally, s is a palindrome if reverse(s) == s.
//
//        Note: If there are multiple palindromic substrings with the same length, return the first occurrence of the longest palindromic substring from left to right.
//
//Examples :
//
//Input: s = “forgeeksskeegfor”
//Output: “geeksskeeg”
//Explanation: There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among all.
//        Input: s = “Geeks”
//Output: “ee”
//Explanation: "ee" is the longest palindromic substring of "Geeks".
//Input: s = “abc”
//Output: “a”
//Explanation: "a", "b" and "c" are longest palindromic substrings of same length. So, the first occurrence is returned.
//        Constraints:
//        1 ≤ s.size() ≤ 103
//s consist of only lowercase English letters.
