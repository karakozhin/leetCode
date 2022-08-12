package test.leetCode.easy.longestCommonPrefix_14;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {

        String[] strs = {"flight", "flowe", "floo"};

        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length && i < last.length; i++) {
            if (first[i] == last[i]) {
                result.append(first[i]);
            }
        }
        System.out.println(result.toString());
    }
}
