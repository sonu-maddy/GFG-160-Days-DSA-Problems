package Sorting;

public class CountInversions {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int start =0;
        int end = arr.length;

        return inversion(arr,start,end);


    }

    static int inversion(int[] arr, int start,int end){
        if(end - start <= 1){
            return 0;
        }

        int mid = (start+ end) /2;

        int left = inversion(arr,start,mid);
        int rigth = inversion(arr,mid,end);
        int count = merge(arr,start,mid, end);

        return left+rigth+count;
    }

    static int merge(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];
        int i =start, j = mid, k =0;
        int count =0;

        while(i<mid && j<end){
            if(arr[i] <= arr[j]){
                mix[k++] = arr[i++];

            }else{
                mix[k++] = arr[j++];
                count += (mid -i);
            }
        }
        while(i<mid){
            mix[k++] = arr[i++];
        }

        while(j<end){
            mix[k++] = arr[j++];
        }

        System.arraycopy(mix,0,arr,start,mix.length);

        // for(int l=0; l<mix.length; l++){
        //     arr[start + l] = mix[l];
        // }

        return count;
    }
}
