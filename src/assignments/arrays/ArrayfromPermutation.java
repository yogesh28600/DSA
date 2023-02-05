package assignments.arrays;

import java.util.Arrays;

//1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
public class ArrayfromPermutation {

    public static void main(String[] args) {
        int[] arr={0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums){
        int[] arr=new int[nums.length];
        for(int i=0;i< nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}
