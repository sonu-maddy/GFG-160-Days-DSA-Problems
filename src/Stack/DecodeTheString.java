package Stack;

import java.util.Stack;

public class DecodeTheString {
    static String decodeString(String s) {
        // code here

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int k =0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k = k * 10 + (c - '0');

            }
            else if(c == '['){
                countStack.push(k);
                stringStack.push(curr);

                curr = new StringBuilder();
                k =0;
            }
            else if(c == ']'){
                StringBuilder decode = curr;
                curr = stringStack.pop();
                int repeatTime = countStack.pop();
                for(int i=0; i< repeatTime; i++){
                    curr.append(decode);
                }
            }
            else {
                curr.append(c);
            }
        }

        return curr.toString();
    }
}

//Given an encoded string s, decode it by expanding the pattern k[substring], where the substring inside brackets is written k times. k is guaranteed to be a positive integer, and encodedString contains only lowercase english alphabets. Return the final decoded string.
//
//Note: The test cases are generated so that the length of the output string will never exceed 105 .
//
//Examples:
//
//Input: s = "3[b2[ca]]"
//Output: "bcacabcacabcaca"
//Explanation:
//Inner substring “2[ca]” breakdown into “caca”.
//Now, new string becomes “3[bcaca]”
//Similarly “3[bcaca]” becomes “bcacabcacabcaca” which is final result.
//        Input: s = "3[ab]"
//Output: "ababab"
//Explanation: The substring "ab" is repeated 3 times giving "ababab".
//Constraints:
//        1 ≤ |s| ≤ 105
//        1 ≤ k ≤ 100


