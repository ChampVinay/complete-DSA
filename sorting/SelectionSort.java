package sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * this sorting algorithm is called selection sort 
 * time complexity O(n^2)
 * space complexity O(1)5
 * 
 * this algorithm is not stable
 * this algorithim is in place sorting algorithm
 */
public class SelectionSort {

    public static void selectionsort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i){
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter length of the array .");
        int n=sc.nextInt();
        System.out.println("Enter array element , the length of the array is :: "+ n);
        int [] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        sc.close();
       // int[] arr={45,20,2,3,15,5,11};
       System.out.println("your inserted array i.e :: "+ Arrays.toString(input));
        selectionsort(input);
        System.out.println("sorted arr :: "+ Arrays.toString(input));
    }
}
