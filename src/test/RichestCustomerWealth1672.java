package test;


public class RichestCustomerWealth1672 {
    public static void main(String[] args){
        int[][] accounts = {{19,5},{12,4},{2,3}};
        int wealth = 0;
        int currentWealth = 0;
        for(int i=0;i<accounts.length;i++){
            currentWealth = 0;
            for(int b=0;b < accounts[i].length;b++){
                currentWealth += accounts[i][b];
            }
            wealth = Math.max(wealth,currentWealth);
        }
        System.out.println(wealth);
    }
}
