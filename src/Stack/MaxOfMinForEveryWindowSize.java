package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MaxOfMinForEveryWindowSize {

    // brute force approach........
    public static void maxOfMin(int[] arr) {
        int n = arr.length;

        // For every window size
        for (int i = 1; i <= n; i++) {
            int maxOfMin = Integer.MIN_VALUE;

            // Slide window of size k
            for (int j = 0; j <= n - i; j++) {
                int minVal = Integer.MAX_VALUE;

                // Find min in current window [i ... i+k-1]
                for (int k = j; k < j + i; k++) {
                    minVal = Math.min(minVal, arr[k]);
                }

                // Take maximum of all mins
                maxOfMin = Math.max(maxOfMin, minVal);
            }

            System.out.print(maxOfMin + " ");
        }
    }

    //optimal
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
        int n  = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // previous smaller element
        for(int i = 0; i< n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            left[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // next smaller element
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            right[i] = (st.isEmpty()) ? n : st.peek();
            st.push(i);
        }

        // store ans
        int[] ans = new int[n+1];
        Arrays.fill(ans, Integer.MIN_VALUE);

        for(int i = 0; i<n; i++){
            int len = right[i] - left[i] -1;
            ans[len] = Math.max(ans[len], arr[i]);
        }


        // fill remaining entries
        for(int i = n-1; i>=1; i--){
            ans[i] = Math.max(ans[i], ans[i+1]);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            result.add(ans[i]);
        }

        return result;

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 50, 10, 70, 30};
        maxOfMin(arr);
    }
}
