package recursion;

import java.util.Scanner;

public class Multiplication {
    public static void multiply(int a, int b) {
        if (b == 0) {
            return ;
        }
        multiply(a, b-1);
        System.out.println(a + " * " + b + " = " + (a*b));
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two positive integers which you want to multiply :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        multiply(a, b);
        sc.close();
    }
}
