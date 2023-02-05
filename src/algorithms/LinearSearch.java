package algorithms;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={1,3,4,6,3,7,8};
        System.out.println(linearSearch(arr,3));

    }

    static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;

    }

}
