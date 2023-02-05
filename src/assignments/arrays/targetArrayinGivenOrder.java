package assignments.arrays;

import java.util.ArrayList;
import java.util.Arrays;


//9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
public class targetArrayinGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> li=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            li.add(index[i],nums[i]);
        }
        int[] target=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            target[i]=li.get(i);
        }
        return target;
    }

}
