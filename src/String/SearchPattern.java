package String;

import java.util.ArrayList;

public class SearchPattern {
    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int n = pat.length();
        int m = txt.length();
        int[] lps = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =1, len =0; i<n; ){
            if(pat.charAt(i) == pat.charAt(len)){
                lps[i++] = ++len;
            }
            else if(len > 0){
                len = lps[len-1];
            }
            else{
                lps[i++] = 0;
            }
        }

        for(int i =0, j =0; i<m; ){
            if(txt.charAt(i) == pat.charAt(j)){
                i++; j++;

                if(j == n){
                    list.add(i-j);
                    j =lps[j-1];
                }
            }
            else if(j > 0){
                j = lps[j-1];
            }
            else{
                i++;
            }
        }

        return list;
    }
}



//Given two strings, one is a text string txt and the other is a pattern string pat. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices.
//        Note: Return an empty list in case of no occurrences of pattern.
//
//        Examples :
//
//Input: txt = "abcab", pat = "ab"
//Output: [0, 3]
//Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3.
//Input: txt = "abesdu", pat = "edu"
//Output: []
//Explanation: There's no substring "edu" present in txt.
//Input: txt = "aabaacaadaabaaba", pat = "aaba"
//Output: [0, 9, 12]
//Explanation:
//
//Constraints:
//        1 ≤ txt.size() ≤ 106
//        1 ≤ pat.size() < txt.size()
//Both the strings consist of lowercase English alphabets.
