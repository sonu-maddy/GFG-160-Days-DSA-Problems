package Searching;

public class KThElementOfTwoArrays {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i =0, j =0 , count =0;
        int m = a.length, n = b.length;

        while(i < m && j  < n ){
            if(a[i] < b[j]){
                count++;
                if(count == k ){
                    return a[i];
                }
                i++;
            }
            else{
                count++;
                if(count == k){
                    return b[j];
                }
                j++;
            }
        }

        while(i<m){
            count++;
            if(count == k){
                return a[i];
            }
            i++;
        }

        while(j<n){
            count++;

            if(count ==k){
                return b[j];
            }
            j++;
        }

        return -1;
    }
}


//Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.
//
//        Examples :
//
//Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
//Output: 6
//Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
//Input: a[] = [1, 4, 8, 10, 12], b[] = [5, 7, 11, 15, 17], k = 6
//Output: 10
//Explanation: Combined sorted array is [1, 4, 5, 7, 8, 10, 11, 12, 15, 17]. The 6th element of this array is 10.
//Constraints:
//        1 ≤ a.size(), b.size() ≤ 106
//        1 ≤ k ≤ a.size() + b.size()
//0 ≤ a[i], b[i] ≤ 108
