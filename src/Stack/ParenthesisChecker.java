package Stack;

import java.util.Stack;

public class ParenthesisChecker {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(')');
            }else if(ch == '{'){
                stack.push('}');
            }else if(ch == '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() != ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
}

//Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']', verify the validity of the arrangement.
//An input string is valid if:
//
//        1. Open brackets must be closed by the same type of brackets.
//         2. Open brackets must be closed in the correct order.
//
//        Examples :
//
//Input: s = "[{()}]"
//Output: true
//Explanation: All the brackets are well-formed.
//        Input: s = "[()()]{}"
//Output: true
//Explanation: All the brackets are well-formed.
//        Input: s = "([]"
//Output: false
//Explanation: The expression is not balanced as there is a missing ')' at the end.
//        Input: s = "([{]})"
//Output: false
//Explanation: The expression is not balanced as there is a closing ']' before the closing '}'.
//Constraints:
//        1 ≤ s.size() ≤ 106
//s[i] ∈ {'{', '}', '(', ')', '[', ']'}
//
//
