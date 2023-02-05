package assignments.arrays;

import java.util.ArrayList;
import java.util.List;

//Hard
//1. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }



    static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> spiral = new ArrayList<>();
        //four pointers to iterate through 2d matrix
        int top=0;
        int bottom=arr.length-1;
        int left=0;
        int right=arr[0].length-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                spiral.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                spiral.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    spiral.add(arr[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    spiral.add(arr[i][left]);
                }
                left++;
            }
        }
        return spiral;
    }
}
