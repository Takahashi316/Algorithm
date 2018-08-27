package com.company;







//Input: amount = 5, coins = [1, 2, 5]
//        Output: 4
//        Explanation: there are four ways to make up the amount:
//        5=5
//        5=2+2+1
//        5=2+1+1+1
//        5=1+1+1+1+1
public class CoinChangeTwo {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        dp[0][0] = 1;

        for (int i = 1; i <= coins.length; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i-1][j] + (j >= coins[i-1] ? dp[i][j-coins[i-1]] : 0);
            }
        }
        return dp[coins.length][amount];
    }
}
