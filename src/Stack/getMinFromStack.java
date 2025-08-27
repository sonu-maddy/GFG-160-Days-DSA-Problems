package Stack;

import java.util.Stack;

class Solution {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public Solution() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        mainStack.push(x);

        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }

    }

    // Remove the top element from the Stack
    public void pop() {

        // code here
        if(mainStack.isEmpty()) return;

        int top = mainStack.pop();

        if(!minStack.isEmpty() && top == minStack.peek()){
            minStack.pop();
        }
    }

    // Returns top element of the Stack

    public int peek() {
        // code here

        if(mainStack.isEmpty()) return -1;
        return mainStack.peek();
    }


    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if(minStack.isEmpty()) return -1;
        return minStack.peek();
    }

    public static void main(String[] args) {

    }
}