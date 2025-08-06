package String;

public class NonRepeatingCharacter {
    static char nonRepeatingChar(String s) {
        // code here
        int[] fq = new int[26];
        for(char c : s.toCharArray()){
            fq[c - 'a']++;
        }

        for(char c : s.toCharArray()){
            if(fq[c -'a'] == 1){
                return c;
            }
        }

        return '$';


    }
}

//Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.
//
//Examples:
//
//Input: s = "geeksforgeeks"
//Output: 'f'
//Explanation: In the given string, 'f' is the first character in the string which does not repeat.
//        Input: s = "racecar"
//Output: 'e'
//Explanation: In the given string, 'e' is the only character in the string which does not repeat.
//        Input: s = "aabbccc"
//Output: -1
//Explanation: All the characters in the given string are repeating.
//        Constraints:
//        1 ≤ s.size() ≤ 105
//
//
