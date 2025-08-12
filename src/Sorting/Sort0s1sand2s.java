package Sorting;

public class Sort0s1sand2s {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] nums) {
        // code here
        int s0 =0, s1 =0, s2 =0;
        int n = nums.length-1;

        for(int i=0; i<=n; i++){
            if(nums[i] == 0){
                s0++;
            }else if(nums[i] == 1){
                s1++;

            }else{
                s2++;
            }
        }

        int idx= 0;

        for(int i =0 ; i< s0; i++){
            nums[idx++] =0;
        }

        for(int i = 0; i< s1; i++){
            nums[idx++] =1;
        }

        for(int i = 0; i< s2; i++){
            nums[idx++] =2;
        }
    }
}


//Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
//Note: You need to solve this problem without utilizing the built-in sort function.
//
//        Examples:
//
//Input: arr[] = [0, 1, 2, 0, 1, 2]
//Output: [0, 0, 1, 1, 2, 2]
//Explanation: 0s 1s and 2s are segregated into ascending order.
//Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
//Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
//Explanation: 0s 1s and 2s are segregated into ascending order.
//Follow up: Could you come up with a one-pass algorithm using only constant extra space?
//Constraints:
//        1 ≤ arr.size() ≤ 106
//        0 ≤ arr[i] ≤ 2
