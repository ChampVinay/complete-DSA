// package recursion;

// import java.util.Scanner;

// public class CalculateFactorial {

//     public static long calculateFactorial(int n){
//         if(n==1)return 1;
//         long ans= n*calculateFactorial(n-1);
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a positive number you want to calculate factorial.");
//         int n=sc.nextInt();
//         long ans = calculateFactorial(n);
//         System.out.println("factorial of  "+n +" = "+ ans);
//         sc.close();
//     }
// }

package recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateFactorial {

    private static Map<Integer, Long> memo = new HashMap<>();

    public static long calculateFactorial(int n){
        if(n == 0 || n == 1) return 1;
        if(memo.containsKey(n)) return memo.get(n);
        long ans = n * calculateFactorial(n - 1);
        memo.put(n, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number you want to calculate factorial.");
        int n = sc.nextInt();
        long ans = calculateFactorial(n);
        System.out.println("factorial of " + n + " = " + ans);
        sc.close();
    }
}