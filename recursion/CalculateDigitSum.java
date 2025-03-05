package recursion;

import java.util.Scanner;

public class CalculateDigitSum {
    public static int calculateSum(int n){
       
        if(n==0)return 0;
        return (n%10)+calculateSum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive number in any degit.");
        int n=sc.nextInt();
        int ans=calculateSum(n);
        System.out.println("ans :: "+ ans);
        sc.close();
    }
}
