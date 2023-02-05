package assignments.arrays;

import java.util.Arrays;

//3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
public class runningsum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i =0;i< nums.length;i++){
            if(i!=0){
                arr[i]=nums[i]+arr[i-1];
            }else{
                arr[i]=nums[i];
            }
        }
        return arr;
    }
}
