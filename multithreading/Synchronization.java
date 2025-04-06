package multithreading;

import java.util.Arrays;
import java.util.Scanner;

public class Synchronization{
    public static synchronized void userInput(int[]arr){
        // synchronized block to ensure thread safety
        // while taking user input of array elements.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of array.");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("you entered array elements :");
        display(arr);
    }

    public static void display(int[]arr){
        synchronized(Synchronization.class){
            for(var i:arr)System.out.print(i+" ");
        }
       
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array ,it shouldn't be negative.");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("take user input of array elements.");
        userInput(arr);
        Arrays.sort(arr);
        System.out.println();
        System.out.println("After sorting ,array look like :");
        display(arr);
        sc.close();
    }
}
