public class MatrixMultiplication {
    static void  Mutliply(int[][] matrixA, int[][] matrixB)
    {
        // code here
        int result[][] = new int[matrixA.length][matrixB[0].length];
        
        for(int i=0;i<matrixA.length; i++){
            for(int j=0;j<matrixB[0].length; j++){
                for(int k=0;k<matrixA[0].length; k++){
                    result[i][j] += matrixA[i][k] * matrixB[k][j];   
                }
            }
        }
        
        for(int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixB[0].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrixA[][]={
            {1,2}, {3,4}
        };

        int matrixB[][]={
            {4,3}, {2,1}
        };

        Mutliply(matrixA, matrixB);
    }
}
