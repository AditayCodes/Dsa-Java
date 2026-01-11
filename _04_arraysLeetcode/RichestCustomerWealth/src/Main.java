// https://leetcode.com/problems/richest-customer-wealth/description/
public class Main {
    public static void main(String[] args) {
        int[][] accounts= {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        //for (int[] account : accounts)
        for(int i=0;i<accounts.length;i++){
            int sumMax=0;
            //for (int i : account)
            for(int j=0;j<accounts[i].length;j++){
                sumMax=sumMax+accounts[i][j];
            }
            if(sumMax > maxWealth){
                maxWealth=sumMax;
            }
        }
        return maxWealth;
    }
}