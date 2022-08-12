package test.leetCode.easy.romanToInteger_13;

import java.util.HashMap;

public class RomanToInteger13 {

    public static void main(String[] args) {

        String a = "III";
        HashMap<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            Integer current = roman.get(a.charAt(i));
            if (i == a.length()-1) {
                sum+=current;
                System.out.println(sum);
            }
            Integer next = roman.get(a.charAt(i + 1));
            if (current < next) {
                sum += next - current;
                i++;
            } else {
                sum += current;
            }
        }
        System.out.println(sum);
    }

}
