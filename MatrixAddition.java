public class MatrixAddition {
    public static void  Addition(int[][] matrixA, int[][] matrixB)
    {
        // code here
        int n = matrixA.length;
        int m = matrixB[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrixA[i][j] += matrixB[i][j];
            }   
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrixA[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrixA[][]={
            {1,2}, {3,4}
        };

        int matrixB[][]={
            {4,3},{2,1}
        };

        Addition(matrixA, matrixB);
    }
}
