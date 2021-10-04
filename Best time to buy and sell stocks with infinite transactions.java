package com.company;
import java.util.Scanner;
//Buy And Sell Stocks With Transaction Fee - Infinite Transactions Allowed
//1. You are given a number n, representing the number of days.
//2. You are given n numbers, where ith number represents price of stock on ith day.
//3. You are give a number fee, representing the transaction fee for every transaction.
//4. You are required to print the maximum profit you can make if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.
//Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).

public class dp_22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int bd=0;
        int sd=0;
        int profit=0;

        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                sd++;
            }
            else{
                profit+=arr[sd]-arr[bd];
                bd=sd=i;
            }
        }
        profit+=arr[sd]-arr[bd];
        System.out.println(profit);

    }
}
