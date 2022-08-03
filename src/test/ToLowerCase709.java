package test;

public class ToLowerCase709 {
    public static void main(String[] args) {
        String str = "AbCDEFG";
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z')
                array[i] = (char) (array[i] + 32);
            System.out.println(array[i]);
        }
        System.out.println(String.valueOf(array));
    }
}
