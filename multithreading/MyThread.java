package multithreading;

import java.util.Arrays;
import java.util.Scanner;

public class MyThread extends Thread {
    public void run(){
        System.out.println("thread class resources executing....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=0;
        n=8;
        System.out.println("Enter the element of array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        System.out.println("you entered array elements :");
        for(var i:arr)System.out.print(i + " ");
        System.out.println();
        Arrays.sort(arr);
        System.out.println("After sorting ,array look like :");
        for(var i:arr)System.out.print(i + " ");
        sc.close();
    }
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        System.out.println("main methos executed.");

        for(int i=0;i<5;i++){
            System.out.println("hii dear how are you ?");
        }
    }
}
