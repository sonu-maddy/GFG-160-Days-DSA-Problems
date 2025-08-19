package Stack;

import java.util.Stack;

public class LongestValidParentheses {
    static int maxLength(String s) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int maxlen = 0;

        stack.push(-1);

        for(int i =0;i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxlen = Math.max(maxlen, i-stack.peek());
                }
            }
        }
        return maxlen;

    }
}


//Given a string s consisting of opening and closing parenthesis '(' and ')'. Find the length of the longest valid parenthesis substring.
//
//A parenthesis string is valid if:
//
//For every opening parenthesis, there is a closing parenthesis.
//The closing parenthesis must be after its opening parenthesis.
//        Examples :
//
//Input: s = "((()"
//Output: 2
//Explanation: The longest valid parenthesis substring is "()".
//Input: s = ")()())"
//Output: 4
//Explanation: The longest valid parenthesis substring is "()()".
//Input: s = "())()"
//Output: 2
//Explanation: The longest valid parenthesis substring is "()".
//Constraints:
//        1 ≤ s.size() ≤ 106
//s consists of '(' and ')' only


