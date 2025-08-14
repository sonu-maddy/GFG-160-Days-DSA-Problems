package Searching;

public class AggressiveCows {
    public static boolean isPossible(int[] stalls , int k , int mid){
        int cowplc = 1;
        int laspo = stalls[0];
        for(int i = 1; i<stalls.length; i++){
            if(stalls[i] - laspo >= mid){
                cowplc++;
                laspo = stalls[i];

                if(cowplc == k){
                    return true;
                }
            }
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low =1;
        int high = stalls[stalls.length-1] - stalls[0];
        int result = 0 ;

        while(low <= high){
            int mid = low + (high - low) /2;

            if(isPossible(stalls , k , mid)){
                result = mid;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }

        return result;
    }
}

//You are given an array with unique elements of stalls[], which denote the positions of stalls. You are also given an integer k which denotes the number of aggressive cows. The task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.
//
//        Examples:
//
//Input: stalls[] = [1, 2, 4, 8, 9], k = 3
//Output: 3
//Explanation: The first cow can be placed at stalls[0],
//the second cow can be placed at stalls[2] and
//the third cow can be placed at stalls[3].
//The minimum distance between cows in this case is 3, which is the largest among all possible ways.
//Input: stalls[] = [10, 1, 2, 7, 5], k = 3
//Output: 4
//Explanation: The first cow can be placed at stalls[0],
//the second cow can be placed at stalls[1] and
//the third cow can be placed at stalls[4].
//The minimum distance between cows in this case is 4, which is the largest among all possible ways.
//Input: stalls[] = [2, 12, 11, 3, 26, 7], k = 5
//Output: 1
//Explanation: Each cow can be placed in any of the stalls, as the no. of stalls are exactly equal to the number of cows.
//The minimum distance between cows in this case is 1, which is the largest among all possible ways.
//Constraints:
//        2 ≤ stalls.size() ≤ 106
//        0 ≤ stalls[i] ≤ 108
//        2 ≤ k ≤ stalls.size()
//
