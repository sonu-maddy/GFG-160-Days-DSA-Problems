package Sorting;
import java.util.*;

public class MergeWithoutExtraSpace {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int left = n-1;
        int right = 0;

        while(left >= 0 && right <m){
            if(a[left] > b[right]){
                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;

                left--;
                right++;
            }
            else{
                break;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }
}

//Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.
//
//        Examples:
//
//Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
//Output: a[] = [2, 2, 3, 4], b[] = [7, 10]
//Explanation: After merging the two non-decreasing arrays, we get, [2, 2, 3, 4, 7, 10]
//Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
//Output: a[] = [1, 2, 3, 5, 8, 9], b[] = [10, 13, 15, 20]
//Explanation: After merging two sorted arrays we get [1, 2, 3, 5, 8, 9, 10, 13, 15, 20].
//Input: a[] = [0, 1], b[] = [2, 3]
//Output: a[] = [0, 1], b[] = [2, 3]
//Explanation: After merging two sorted arrays we get [0, 1, 2, 3].
//Constraints:
//        1 ≤ n, m ≤ 105
//        0 ≤ a[i], b[i] ≤ 107


