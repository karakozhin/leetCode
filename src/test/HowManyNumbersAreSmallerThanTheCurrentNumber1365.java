package test;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {
    public static void main(String[] args) {
        int[] nums = {13,22,33,44,49,35,21,9};
        int[] a = new int[50];
        //Cal freq. of each element
        for(int n:nums){
            a[n]++;
        }
        int sum=0;
        for(int i=0;i<50;i++){
            int temp=a[i];
            a[i]=sum;
            sum+=temp;
        }
        int[] b = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            b[i]=a[nums[i]];
        }
        System.out.println(Arrays.toString(b));
    }
}
