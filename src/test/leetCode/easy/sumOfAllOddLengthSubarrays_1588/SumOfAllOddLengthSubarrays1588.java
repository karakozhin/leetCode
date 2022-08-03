package test;

import java.util.ArrayList;
import java.util.List;

//неправильно прочитал задание и сделал по другому
public class SumOfAllOddLengthSubarrays1588 {
    public static void main(String[] args) {
        String a = "bella";
        String b = "aman";

        char[] chars = a.toCharArray();
        char[] chars2 = b.toCharArray();
        char[] d = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            Character aChar = chars[i];
            for (int ii = 0; ii < chars2.length; ii++) {
                Character c = chars2[ii];
                if (aChar.equals(c)) {
                    d[i] = c;
                    System.out.println(d);
                }
            }
        }
    }
}
