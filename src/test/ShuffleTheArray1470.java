package test;

import java.util.Arrays;

public class ShuffleTheArray1470 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,6,7,8};
        int n = 3;
        int arr[] = new int[nums.length];
        int j = 0;
        for(int i=0 ; i<2*n ; i++){
            arr[i] = nums[j];
            arr[i+1] = nums[j+n];
            i++;
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
