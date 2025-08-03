package Arrays;

public class MaxCircularSubarraySum {
    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int maxsum = arr[0];
        int minsum = arr[0];
        int totalsum = 0;
        int currmin =arr[0];
        int currmax = arr[0];
        for(int i = 1; i<arr.length; i++){
            totalsum += arr[i];

            currmin = Math.min(arr[i] , currmin+arr[i]);
            minsum = Math.min(minsum,currmin);

            currmax = Math.max(arr[i] , currmax+arr[i]);
            maxsum = Math.max(maxsum , currmax);
        }

        totalsum += arr[0];

        if(maxsum<0){
            return maxsum;
        }

        return Math.max(maxsum, totalsum-minsum);

    }
}
