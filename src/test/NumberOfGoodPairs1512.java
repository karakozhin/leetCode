package test;

public class NumberOfGoodPairs1512 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            int index1 = arr[i];
            for (int i2 = i + 1; i2 < arr.length; i2++) {
                int index2 = arr[i2];
                if (index1 == index2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
