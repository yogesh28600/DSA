package algorithms;

public class binarySearch {
    public static void main(String[] args)
    {
        int[] arr = {1,10,19,18,65,77,87,88,90,100};
        int target = 10;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] nums, int target)
    {
        int start = 0;
        int end=nums.length-1;
         while(start <= end)
         {
            int mid = start + (end-start)/2;

            if(target == nums[mid]){
                return mid;
            }
            if(target < nums[mid]) {
                end = mid - 1;
            }else{
                start = mid+1;
            }
         }
         return -1;
    }
}