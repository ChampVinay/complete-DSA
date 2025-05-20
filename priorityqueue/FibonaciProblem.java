package priorityqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonaciProblem {

    public static long fibo(int n){
      if(n<=1)return n;
      return fibo(n-1)+fibo(n-2);
    }

    //use extra space and solve this problem using dp
    //optimization of same recursion call
    public static Map<Integer,Long>memo=new HashMap<>();

    public static Long memoziation(int n){
        //base case 
        if(n<=1)return (long)n;
        //check container if already available n recursive value then return instead again calculate 
        if(memo.containsKey(n))return memo.get(n);

        long val=memoziation(n-1)+ memoziation(n-2);
        memo.put(n, val);
        return val;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number which you want to get fibonaci sum");
        int input=sc.nextInt();
        // long ans= fibo(input);
        long ans= memoziation(input);
        System.out.println("fibonaci sum of "+ input+" = "+ans);
        sc.close();
    }
    
}
