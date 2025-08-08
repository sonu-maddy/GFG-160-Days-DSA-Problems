package String;

public class StringsRotationsofEachOther {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {

        if(s1.length() != s2.length()){
            return false;
        }
        String text = s1 + s1;
        String pat = s2;
        int n = text.length();

        int[] lps = new int[n];
        for(int i = 1 , len = 0; i<pat.length();){
            if(pat.charAt(i) == pat.charAt(len)){
                lps[i++] = ++len;
            }
            else if(len >0 ){
                len = lps[len -1];
            }
            else{
                lps[i++] =0;
            }
        }

        for(int i = 0 , j = 0; i<n; ){
            if(text.charAt(i) == pat.charAt(j)){
                i++; j++;

                if(j == pat.length() ){
                    return true;
                }
            }
            else if(j>0){
                j = lps[j-1];
            }
            else{
                i++;
            }
        }

        return false;
    }
}

//You are given two strings s1 and s2, of equal lengths. The task is to check if s2 is a rotated version of the string s1.
//
//        Note: A string is a rotation of another if it can be formed by moving characters from the start to the end (or vice versa) without rearranging them.
//
//Examples :
//
//Input: s1 = "abcd", s2 = "cdab"
//Output: true
//Explanation: After 2 right rotations, s1 will become equal to s2.
//        Input: s1 = "aab", s2 = "aba"
//Output: true
//Explanation: After 1 left rotation, s1 will become equal to s2.
//        Input: s1 = "abcd", s2 = "acbd"
//Output: false
//Explanation: Strings are not rotations of each other.
//        Constraints:
//        1 ≤ s1.size(), s2.size() ≤ 105
//s1, s2 consists of lowercase English alphabets.
