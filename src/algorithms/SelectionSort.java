package algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,5,4,2,7,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=maxIndex(arr,0,last);
            Swap(arr,max,last);
        }
    }
    static int maxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i=0; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static int[] Swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return arr;
    }
}
