package algorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int CIndex=arr[i]-1;
            if(arr[i]!=arr[CIndex]) {
                Swap(arr, i, CIndex);
            }else
                i++;
        }
    }
    static int[] Swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return arr;
    }
}
