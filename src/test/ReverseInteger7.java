package test;


public class ReverseInteger7 {
    public static void main(String[] args) {
        int rev = 0;
        int x = 496;
        while (x != 0) {
            int digit = x % 10;
            if (rev < Integer.MIN_VALUE/10 || rev > Integer.MAX_VALUE/10) {
                System.out.println(0);
            } else {
                rev = rev * 10 + digit;
                x /= 10;
            }
        }
        System.out.println(rev);
    }
//        int x = 496;
//        String xa = String.valueOf(x);
//        char[] chars = xa.toCharArray();
//        int length = chars.length;
//        int i1 = length - 1;
//        while(i1 == 0 || i1 !=0){
//            char c = xa.charAt(i1);
//            System.out.println(c);
//            i1--;
//        }
//    }
}
