package Arrays;
import java.util.*;


public class MInimizeHeight2 {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;

        int greatest = arr[n-1];
        int lowest = arr[0];
        int ans = arr[n-1] - arr[0];

        for(int i = 1;i<n;i++){
            greatest = Math.max(arr[n-1]-k, arr[i-1]+k);
            lowest = Math.min(arr[0]+k,arr[i]-k);

            if(lowest < 0 ){
                continue;
            }

            ans = Math.min(ans , greatest-lowest);
        }
        return ans;
    }
}
