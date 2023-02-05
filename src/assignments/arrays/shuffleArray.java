package assignments.arrays;

import java.util.ArrayList;
import java.util.Arrays;

//5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
public class shuffleArray {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7,8,9};
        shuffle(nums,4);
    }

    public static void shuffle(int[] nums, int n) {
     //ArrayList<Integer> li=new ArrayList<>();
        // System.out.println(helper(nums,n,0, n,li));
        int[] arr=new int[nums.length];
        System.out.println(Arrays.toString(helper1(nums,n,0,n,arr,0)));
    }

    static ArrayList<Integer> helper(int[] nums, int n, int a,int b, ArrayList<Integer> li){
        if(a==n){
            return li;
        }
        li.add(nums[a]);
        li.add(nums[b]);
        return helper(nums,n,a+1,b+1,li);
    }

    static int[] helper1(int[] nums, int n, int a,int b, int[] arr,int i){
        if(a==n){
            return arr;
        }
        arr[i]=nums[a];
        arr[i+1]=nums[b];
        return helper1(nums, n,a+1,b+1, arr, i+2);
    }
}
