package Arrays;

public class KadensAlgo {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int n = arr.length;
        int maximum = Integer.MIN_VALUE;
        int sum =0;

        for(int i =0; i<n; i++){
            sum += arr[i];

            maximum = Math.max(sum,maximum);

            if(sum < 0){
                sum = 0;
            }
        }

        return maximum;
    }
}
