package priorityqueue;

import java.util.Scanner;

public class FibOfTabulation {

    public static long tabulation(int n){
        long[]arr=new long[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number which you want to get fibonaci sum");
        int input=sc.nextInt();
        // long ans= fibo(input);
        long ans= tabulation(input);
        System.out.println("fibonaci sum of "+ input+" = "+ans);
        sc.close();
    }
}
