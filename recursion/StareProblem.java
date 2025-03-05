package recursion;

import java.util.Scanner;

public class StareProblem {
    public static int numberOfWays(int n){
        if(n<=1)return n;
        return numberOfWays(n-1)+numberOfWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stars you want to print");
        int n=sc.nextInt();
        int ans =numberOfWays(n+1);
        System.out.println("Number of ways to print "+n+" stars is "+ans);
        sc.close();
    }
}
