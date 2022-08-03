package test;

import java.util.HashMap;

public class RomanToInteger13 {

    public static void main(String[] args) {

        String a = "DM";
        HashMap<String, Integer> roman = new HashMap<>();
//        roman.put(1, "I");
//        roman.put(5, "V");
//        roman.put(10, "X");
//        roman.put(50, "L");
//        roman.put(100, "C");
//        roman.put(500, "D");
//        roman.put(1000, "M");

        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        char[] chars = a.toCharArray();
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            for (String romanStr : roman.keySet()) {
                String s = Character.toString(chars[i]);
                if (romanStr.equals(s)) {
                    Integer integer = roman.get(romanStr);
                    j = integer + j;
                }
            }
        }
        System.out.println(j);
    }

}
