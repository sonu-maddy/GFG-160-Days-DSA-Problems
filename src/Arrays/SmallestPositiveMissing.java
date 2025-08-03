package Arrays;

public class SmallestPositiveMissing {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n =arr.length;
        for(int i=0; i<n;i++){
            if(arr[i] >0 && arr[i] <n){
                int index = arr[i]-1;

                if(arr[index] != arr[i]){
                    swap(arr,index, i);
                    i--;
                }
            }
        }

        for(int i =0; i<n; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
    void swap(int[] arr, int index , int i){
        int temp = arr[index];
        arr[index]= arr[i];
        arr[i] = temp;
    }
}
