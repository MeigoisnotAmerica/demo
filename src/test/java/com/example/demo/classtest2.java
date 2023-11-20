package com.example.demo;

public class classtest2 {
    public static void main(String[] args) {
        TaipeiBank account = new TaipeiBank();

        int balanceAfterSaving500 = account.saving(500);
        int balanceAfterSavingNegative500 = account.saving(-500);
        int balanceAfterSaving1000 = account.saving(1000);

        System.out.println("Balance after saving 500: " + balanceAfterSaving500);
        System.out.println("Balance after saving -500: " + balanceAfterSavingNegative500);
        System.out.println("Balance after saving 1000: " + balanceAfterSaving1000);
    }
}
