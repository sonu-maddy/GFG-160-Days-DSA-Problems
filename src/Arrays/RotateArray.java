package Arrays;

public class RotateArray {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int j=0;
        d = d % arr.length;
        int[] temp = new int[arr.length];

        for(int i = d;i<arr.length;i++){

            temp[j] = arr[i];
            j++;
        }
        for(int i = 0; i<d; i++){
            temp[j]=arr[i];
            j++;
        }

        for(int i = 0;i<arr.length;i++){
            arr[i] = temp[i];
        }
    }
}
