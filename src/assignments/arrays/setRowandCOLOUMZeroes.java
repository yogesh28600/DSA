package assignments.arrays;

//4. [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
public class setRowandCOLOUMZeroes {

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1,1}, {1, 1, 1,1}, {1, 0, 1,1}};
        setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        boolean[][] mat = new boolean[matrix.length][matrix[0].length];
        mat = helper(matrix, 0, mat);
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                if(mat[i][j]==true){
                    matrix[i][j]=0;
                }
            }
        }

    }

    static boolean[][] helper(int[][] matrix, int row, boolean[][] mat) {
        if (row == matrix.length ) {
            return mat;
        }

        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] == 0) {
                mat=makeTrue(mat, row, i);
            }
        }

        return helper(matrix, row+1, mat);
    }

    static boolean[][] makeTrue(boolean[][] mat,int row,int col) {
        for(int i=0;i<mat[row].length;i++){
            mat[row][i]=true;
        }
        for(int i=0;i<mat.length;i++){
            mat[i][col]=true;
        }

        return mat;
    }




}

