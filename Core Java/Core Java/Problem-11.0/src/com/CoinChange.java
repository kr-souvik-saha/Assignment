package com;

import java.util.Vector;

public class CoinChange{
  
    static int coins[] = {1,2,5,10,20,50,100,500,2000};
    static int n = coins.length;

    static void findCoin(int V){
    	int count=0;
        Vector<Integer> ans = new Vector<>();
        for (int i = n - 1; i >= 0; i--){
            while (V >= coins[i]) {
                V -= coins[i];
                ans.add(coins[i]);
                count++;
            }
        }
        System.out.print(count+". Break Down-");
        for (int i = 0; i < ans.size(); i++){
            System.out.print(
                " Rs." + ans.elementAt(i)+"*1");
            if(i<1) {
            	System.out.print(" +");
            }
        }
    }
  
    public static void main(String[] args) 
    {
        int Ammount = 756;
        findCoin(Ammount);
    }
}
