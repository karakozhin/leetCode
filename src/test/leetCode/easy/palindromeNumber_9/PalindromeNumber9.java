package test.leetCode.easy.palindromeNumber_9;

public class PalindromeNumber9 {
    public static void main(String[] args) {
        int rev = 0;
        int xx = 1552;
        int x = 1552;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        if(rev == xx){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
