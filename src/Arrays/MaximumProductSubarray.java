package Arrays;

public class MaximumProductSubarray {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int maximum = Integer.MIN_VALUE;
        int suffix  =1;
        int prefix = 1;
        for(int i = 0 ; i<n ; i++){

            if(suffix == 0){
                suffix =1;
            }
            if(prefix == 0){
                prefix =1;
            }

            suffix = suffix*arr[i];
            prefix = prefix*arr[n-i-1];

            if(maximum < Integer.MAX_VALUE || maximum > Integer.MIN_VALUE){

                maximum = Math.max(maximum,Math.max(suffix,prefix));
            }

        }
        return maximum;
    }
}
