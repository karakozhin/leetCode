package test.leetCode.easy.sumOfArray_1480;

import java.util.Arrays;

public class SumOf1dArray1480 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
            int summa = 0;
            int[] sums = new int[nums.length];

            for(int i=0; i<nums.length; i++){
                summa = summa + nums[i];
                sums[i] = summa;
            }
        System.out.println(Arrays.toString(sums));
    }
}
