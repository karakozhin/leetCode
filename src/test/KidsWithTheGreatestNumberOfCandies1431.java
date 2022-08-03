package test;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies1431 {
    public static void main(String[] args) {
        int[] candies={1,7,3,4,5,6};
        int extraCandies = 3;
        int a = 0;
        List<Boolean> ab = new ArrayList<>();
        for (int i =0;i<candies.length;i++){
            int candy = candies[i];
            if(a<=candy){
                a=candy;
            }
        }
        System.out.println(a);
        for(int i =0;i<candies.length;i++){
            int candy = candies[i];
            int i1 = candy + extraCandies;
            if(i1>=a){
                ab.add(true);
            }else{
                ab.add(false);
            }
        }
        System.out.println(ab);
    }
}
