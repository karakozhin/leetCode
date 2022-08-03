package test;

public class SubtractTheProductAndSumOfDigitsOfAnInteger1281 {
    public static void main(String[] args) {
        int n = 234;
        String a = String.valueOf(n);
        char[] chars = a.toCharArray();
        int sum = 1;
        int sumB = 0;
        for (int i=0;i< chars.length;i++){
            int d = Integer.parseInt(String.valueOf(a.charAt(i)));
            sum *= d;
            System.out.println(sum);
        }
        for (int ii=0;ii< chars.length;ii++){
            int e = Integer.parseInt(String.valueOf(a.charAt(ii)));
            sumB += e;
            System.out.println(sumB);
        }
        int sumC=sum-sumB;
        System.out.println(sumC);
    }
}
