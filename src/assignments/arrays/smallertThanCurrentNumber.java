package assignments.arrays;

import java.util.Arrays;

//8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
public class smallertThanCurrentNumber {

    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count =0;
            for (int j=0;j<nums.length;j++){

                if(i!=j && nums[i]>nums[j]){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;

    }
}
