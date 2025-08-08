package String;

public class MinCharstoAddforPalindrome {
    public static int minChar(String s) {
        // Write your code here

        String rev = new StringBuilder(s).reverse().toString();
        String pat = s + '|' + rev;
        int n = pat.length();
        int[] lps = new int[n];
        for(int i=1, len = 0; i<n;){
            if(pat.charAt(i) == pat.charAt(len)){
                lps[i++] = ++len;
            }
            else if(len > 0){
                len = lps[len-1];
            }else{
                lps[i++] =0 ;
            }
        }

        return s.length() - lps[n-1];
    }

}



//Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.
//
//Note: A palindrome string is a sequence of characters that reads the same forward and backward.
//
//        Examples:
//
//Input: s = "abc"
//Output: 2
//Explanation: Add 'b' and 'c' at front of the above string to make it palindrome: "cbabc"
//Input: s = "aacecaaaa"
//Output: 2
//Explanation: Add 2 a's at front of the above string to make it palindrome: "aaaacecaaaa"
//Constraints:
//        1 ≤ s.size() ≤ 106
//s consists of lowercase english alphabets
