package test.leetCode;

public class FindMaxArray {
    public static void main(String[] args) {
        int[] array = {85, 10, 9, 56, 23, 61, 86};
        int a = array[0];
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (a > b)
                b = a;
            System.out.println(b);
        }
    }
}
