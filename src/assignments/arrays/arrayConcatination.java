package assignments.arrays;

import java.util.Arrays;

//2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
public class arrayConcatination {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] nums1=new int[2*nums.length];
        for(int i=0;i<nums1.length;i++){
            if(i>=nums.length){
                nums1[i]=nums[i-nums.length];
            }else{
                nums1[i]=nums[i];
            }

        }
        return nums1;
    }
}
