package Arrays;

public class RevaeseAnArray {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length-1;
        for(int i = 0; i<=n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
    }
}
