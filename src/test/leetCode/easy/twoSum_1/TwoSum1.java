package test.leetCode.easy.twoSum_1;


import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 7, 1};
        int target = 8;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(result).toArray()));
    }
}
