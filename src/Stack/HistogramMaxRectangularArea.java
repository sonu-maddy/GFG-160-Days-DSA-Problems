package Stack;

import java.util.Stack;

public class HistogramMaxRectangularArea {
    public static int getMaxArea(int arr[]) {
        int n = arr.length;
        int[] pse = findPSE(arr);  // Previous Smaller Element
        int[] nse = findNSE(arr);  // Next Smaller Element

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;

    }

    private static int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return pse;
    }

    private static int[] findNSE(int[] arr) {

            int n = arr.length;
            int[] nse = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }
                nse[i] = stack.isEmpty() ? n : stack.peek();
                stack.push(i);
            }
            return nse;

    }

    public static void main(String[] args) {
        int arr[] = {60, 20, 50, 40, 10, 50, 60};
        System.out.println(getMaxArea(arr));
    }
}
