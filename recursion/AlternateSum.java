package recursion;

import java.util.Scanner;

public class AlternateSum {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer which you want to find the sum of alternate digits of :");
        int n=sc.nextInt();
        int sum=calculateAlternateSum(n);
        System.out.println("The sum of alternate digits of "+n+" is : "+sum);
        sc.close();
    }

    public static int calculateAlternateSum(int n) {
       if(n==0)return 0;
       if(n%2==0)return calculateAlternateSum(n-1)-n;
       else return calculateAlternateSum(n-1)+n;
    }
}
