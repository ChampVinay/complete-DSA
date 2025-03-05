package recursion;

import java.util.Scanner;

public class CalculatePowerOfNumber {

    public static int calculatePower(int base, int power){
        if(power==0){
            return 1;
        }
        return base * calculatePower(base, power-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the base number :");
        int base=sc.nextInt();
        System.out.println("Enter the power to which you want to raise the base number :");
        int power=sc.nextInt();
        int result=calculatePower(base,power);
        System.out.println(base+" raised to the power "+power+" is : "+result);
        sc.close();
    }

}
