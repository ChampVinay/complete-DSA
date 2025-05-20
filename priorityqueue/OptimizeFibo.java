package priorityqueue;

import java.util.Scanner;

public class OptimizeFibo {
    public static long calculateFibo(int n){

        long first=0, second=1,third;
        for(int i=2;i<=n;i++){
            third=first+second;
            first=second;
            second=third;
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number which you want to get fibonaci sum");
        int input=sc.nextInt();
        // long ans= fibo(input);
        long ans= calculateFibo(input);
        System.out.println("fibonaci sum of "+ input+" = "+ans);
        sc.close();
    }
}
