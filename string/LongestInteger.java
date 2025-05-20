package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestInteger {

    public static String largestNumber(final int[] A) {
        // your code here
        
        List<Integer>list=new ArrayList<>();
         
        for(var i:A){
            if(i>9){
                int x=i%10;
                list.add(x);
                int y=i/10;
                list.add(y);
            }
            else{
                list.add(i);
            }

        }
        int[]arr=new int[list.size()];
        int v=0;
        for(var i:list){
            arr[v++]=i;
        }

        Arrays.sort(arr);
        String bigNumber="";
        for(int i=arr.length-1;i>=0;i--){
            bigNumber=bigNumber+String.valueOf(arr[i]);
        }
        System.out.println("bigNum :: "+ bigNumber);

        return bigNumber;
    }
    public static void main(String[] args) {
        int[]arr={3, 30, 34, 5, 9};
        largestNumber(arr);
    }
}
