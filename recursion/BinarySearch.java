package recursion;

public class BinarySearch {
    public static int  runBinarySearchTests(int[] arr,int left,int right ,int targets) {
        
        int mid=0;
        if(left<=right){
            mid=left+(right-left)/2;
            if(arr[mid]==targets){
                return mid;
            }
            
            if(arr[mid]>targets){
                return runBinarySearchTests(arr,left,mid-1 ,targets);
            }
                
            return runBinarySearchTests(arr,mid+1,right, targets);
        }
        return -1;
       
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int[] targets = {10, 4, 2, 40, 5};

        for(int i:targets){
            int result = runBinarySearchTests(arr, 0, arr.length-1, i);
            System.out.println("Element " + i + " is at index: " +result);

        }
        

    }
}
