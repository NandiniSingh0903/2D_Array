public class DiagonalSum {
    static int diagonalSum(int[][] mat) {
        int n = mat.length-1;
        int sum=0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j || (i+j)==n){
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("Diagonal Sum = "+diagonalSum(mat));
    }
}
