package String;

import java.util.HashMap;

public class Anagram {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        HashMap<Character,Integer> chcount = new HashMap<>();

        for(char ch: s1.toCharArray()){

            chcount.put(ch, chcount.getOrDefault(ch,0)+1);

        }

        for(char ch: s2.toCharArray()){

            chcount.put(ch, chcount.getOrDefault(ch,0)-1);

        }

        for(var pair : chcount.entrySet()){
            if(pair.getValue() != 0){
                return false;
            }
        }

        return true;

    }
}


//Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
//Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.
//
//        Examples:
//
//Input: s1 = "geeks" s2 = "kseeg"
//Output: true
//Explanation: Both the string have same characters with same frequency. So, they are anagrams.
//        Input: s1 = "allergy", s2 = "allergyy"
//Output: false
//Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams.
//Input: s1 = "listen", s2 = "lists"
//Output: false
//Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.
//Constraints:
//        1 ≤ s1.size(), s2.size() ≤ 105
//s1, s2 consists of lowercase English letters.
