package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("vvedite razmer massiva: ");

        int n = in.nextInt();

        int[] a = new int[n];

        System.out.println("vvedite znachenya massiva: ");
        for (int i =0; i < a.length; i++){
            a[i] = in.nextInt();
            System.out.println(a[i]);
        }
        int min = a[0];
        int max = a[0];

        int imin = 0;
        int imax = 0;

        for (int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
                imin = i;
            }else{
                max = a[i];
                imax = i;
            }
            System.out.println("imin: " + imin);
            System.out.println("imax: " + imax);
        }
    }
}
