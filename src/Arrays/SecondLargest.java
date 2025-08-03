package Arrays;

class Solution {
    public int getSecondLargest(int[] arr) {


        int n =arr.length;
        if(n == 0){
            return -1;
        }
        int lg =-1;
        int slg =-1;
        for(int i=0;i<n;i++){
            if(arr[i]>lg){
                lg = arr[i];
            }
        }

        for(int i=0; i<n;i++){
            if(arr[i]>slg && arr[i] != lg){
                slg =arr[i];
            }
        }

        return slg;


    }
}
