package Sorting;

import java.util.*;

public class NonoverlappingIntervals {
    static int minRemoval(int intervals[][]) {
        // code here
        if(intervals.length == 0){
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count =1;

        int pre_interval = 0;

        for(int i =1; i<intervals.length; i++){
            if(intervals[i][0] >= intervals[pre_interval][1]){
                pre_interval = i;
                count++;
            }
        }

        return intervals.length - count;
    }
}

//Given a 2D array intervals[][], where intervals[i] = [starti, endi]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
//
//        Note: Two intervals are considered non-overlapping if the end time of one interval is less than or equal to the start time of the next interval.
//
//        Examples:
//
//Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]
//Output: 1
//Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping.
//        Input: intervals[][] = [[1, 3], [1, 3], [1, 3]]
//Output: 2
//Explanation: You need to remove two [1, 3] to make the rest of the intervals non-overlapping.
//        Input: intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]
//Output: 0
//Explanation: All intervals are already non-overlapping.
//        Constraints:
//        1 ≤ intervals.size() ≤  105
//        0 ≤ starti < endi ≤ 5*104


