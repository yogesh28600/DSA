package algorithms;

import java.util.Arrays;

public class BinarySearch2DArray {

    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1,3,4,6,7},
                        {2,5,8,9,10},
                        {12,14,28,33,35}
                };
        int target=28;
        System.out.println(Arrays.toString(binarySearch2D(matrix,target)));

    }
    static int[] binarySearch2D(int[][] arr, int target){
        int row=0;
        int col=arr[0].length-1;

        while(row<arr.length && col>=0){
            if(target==arr[row][col]){
                return new int[]{ row, col };
            }
            if(target<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
