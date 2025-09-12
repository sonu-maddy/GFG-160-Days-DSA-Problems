package Matrix;

public class SetMatrixZeros {
    public void setMatrixZeroes(int[][] mat) {
        boolean firstrow = false, firstcol = false;

        for(int i =0; i< mat.length;i++){
            for(int j = 0; j< mat[0].length;j++){
                if(mat[i][j] == 0){
                    if(i == 0) firstrow = true;
                    if(j == 0) firstcol = true;

                    mat[0][j] =0;
                    mat[i][0] =0;

                }

            }
        }

        for(int i =1; i<mat.length;i++){
            for(int j = 1; j < mat[0].length;j++){
                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] = 0;
                }
            }
        }

        if(firstrow){
            for(int j = 0; j < mat[0].length;j++){
                mat[0][j] = 0;
            }
        }

        if(firstcol){
            for(int i = 0; i < mat.length;i++){
                mat[i][0] = 0;
            }
        }
    }
}


//You are given a 2D matrix mat[][] of size n x m. The task is to modify the matrix such that if mat[i][j] is 0, all the elements in the i-th row and j-th column are set to 0.
//
//Examples:
//
//Input:
//
//Output:
//
//Explanation: mat[1][1] = 0, so all elements in row 1 and column 1 are updated to zeroes.
//Input:
//
//Output:
//
//Explanation: mat[0][0] and mat[0][3] are 0s, so all elements in row 0, column 0 and column 3 are updated to zeroes.
//Constraints:
//        1 ≤ n, m ≤ 500
//        - 231 ≤ mat[i][j] ≤ 231 - 1


