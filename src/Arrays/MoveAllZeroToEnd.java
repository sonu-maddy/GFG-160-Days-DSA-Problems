package Arrays;

class MoveAllZeroToEnd {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int[] temp =new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[count] = arr[i];
                count++;
            }
        }
        while(count<n){
            temp[count++] = 0;
        }

        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
}
