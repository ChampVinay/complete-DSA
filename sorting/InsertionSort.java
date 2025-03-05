package shortingalgorithms;

import java.util.Arrays;

/*
 * this is a selection short 
 * this is a inplace shorting algorithms
 * this is a  stable shorting algo
 * wrost case ,time complexity O(n^2)
 * space complexity O(1)
 * best case ,time complexity O(n)
 */ 
public class InsertionSort {
    public static void selectionsort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
             int temp=arr[j];
             arr[j]=arr[j-1];
             arr[j-1]=temp;
             j--;
            }
        }
    }
   public static void main(String[] args) {
    int[] arr={9,3,5,8,2,1,7};
    selectionsort(arr);
    System.out.println("selection sort :: "+Arrays.toString(arr));
   }
}
