package recursion;

import java.util.Scanner;

public class CalculateFibonaciOfNthNumber {
    public static int calculateFibonaci(int n){
        if(n==0 || n==1)return n;
        return calculateFibonaci(n-1)+calculateFibonaci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive number.");
        int n=sc.nextInt();
        int ans =calculateFibonaci(n);
        System.out.println("Fibonaci of "+ n +" = "+ans);
        sc.close();//0 1 1 2 3
    }
}
