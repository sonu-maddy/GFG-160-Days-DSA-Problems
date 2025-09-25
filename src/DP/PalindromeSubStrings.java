package DP;

public class PalindromeSubStrings {
    public int countPS(String s) {
        // code here
        int n = s.length();
        int count = 0;
        for(int i = 0; i<n; i++){
            count += solve(s, i, i);
            count += solve(s, i, i+1);
        }
        return count;
    }
    private int solve(String s, int left, int right){
        int count =0;
        int n = s.length();

        while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
            if(right-left+1 >= 2){
                count++;
            }
            left--;
            right++;
        }
        return count;
    }
}

//Given a string s, count all palindromic sub-strings present in the string. The length of the palindromic sub-string must be greater than or equal to 2.
//
//Note: A substring is palindromic if it reads the same forwards and backwards.
//
//        Examples:
//
//Input: s = "abaab"
//Output: 3
//Explanation: All palindromic substrings (of length > 1) are: "aba", "aa", "baab".
//Input: s = "aaa"
//Output: 3
//Explanation: All palindromic substrings (of length > 1) are: "aa", "aa", "aaa".
//Input: s = "abbaeae"
//Output: 4
//Explanation: All palindromic substrings (of length > 1) are: "bb", "abba", "aea", "eae".
//Constraints:
//        2 ≤ s.size() ≤ 5 * 103
//s contains only lowercase english characters
