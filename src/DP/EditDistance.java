package DP;

public class EditDistance {
    public int editDistance(String s1, String s2) {
        // Code here
        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1+1][n2+1];

        for(int i =1; i<=n1;i++){
            dp[i][0] = i;
        }
        for(int i =1; i<=n2;i++){
            dp[0][i] = i;
        }

        for(int i =1; i<= n1; ++i){
            for(int j =1; j<=n2; ++j){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int topleft = dp[i-1][j-1];
                    int top = dp[i-1][j];
                    int left = dp[i][j-1];
                    dp[i][j] = Math.min(topleft, Math.min(top, left)) +1;
                }
            }
        }

        return dp[n1][n2];
    }
}


//Given two strings s1 and s2. Return the minimum number of operations required to convert s1 to s2.
//The possible operations are permitted:
//
//Insert a character at any position of the string.
//Remove any character from the string.
//Replace any character from the string with any other character.
//Examples:
//
//Input: s1 = "geek", s2 = "gesek"
//Output: 1
//Explanation: One operation is required, inserting 's' between two 'e' in s1.
//Input: s1 = "gfg", s2 = "gfg"
//Output: 0
//Explanation: Both strings are same.
//Input: s1 = "abcd", s2 = "bcfe"
//Output: 3
//Explanation: We can convert s1 into s2 by removing ‘a’, replacing ‘d’ with ‘f’ and inserting ‘e’ at the end.
//        Constraints:
//        1 ≤ s1.length(), s2.length() ≤ 103
//Both the strings are in lowercase.






