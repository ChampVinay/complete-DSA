package arrayproblems;

public class LargestSubArrayZeroSum {

    static int maxLen(int arr[]) {
        // code here
        int sum=0;
        int finalcount=0;
        int count=0;
        
        for(int i=0;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
               sum+=arr[j];
               count++;
               if(sum==0 && count>finalcount){
                  finalcount=count;
               }
           }
           count=0;
           sum=0;
        }
        return finalcount;
    }

    public static void main(String[] args) {
        
        int [] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println(maxLen(arr));
    }
}
