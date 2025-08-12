package Sorting;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OverlappingIntervals {
    public List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> ans = new ArrayList<>();
        if(arr == null || arr.length == 0){
            return ans;
        }

        Arrays.sort(arr, Comparator.comparingInt(i -> i[0]));

        int[] current = arr[0];

        ans.add(current);

        for(int i =1;i<arr.length;i++){
            int[] interval =arr[i];

            if(interval[0] <= current[1]){
                current[1] =Math.max(current[1], interval[1]);
            }
            else{
                current = interval;
                ans.add(current);
            }
        }

        return ans;

    }
}



//Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.
//
//Examples:
//
//Input: arr[][] = [[1, 3], [2, 4], [6, 8], [9, 10]]
//Output: [[1, 4], [6, 8], [9, 10]]
//Explanation: In the given intervals we have only two overlapping intervals here, [1, 3] and [2, 4] which on merging will become [1, 4]. Therefore we will return [[1, 4], [6, 8], [9, 10]].
//Input: arr[][] = [[6, 8], [1, 9], [2, 4], [4, 7]]
//Output: [[1, 9]]
//Explanation: In the given intervals all the intervals overlap with the interval [1, 9]. Therefore we will return [1, 9].
//Constraints:
//        1 ≤ arr.size() ≤ 105
//        0 ≤ starti ≤ endi ≤ 106


