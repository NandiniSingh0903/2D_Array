import java.util.Arrays;
public class SetMatrixZeros {
    static void setZeroes(int[][] matrix) {
        int row[] = new int[matrix.length];
        int col[] = new int [matrix[0].length];

        Arrays.fill(row,1);
        Arrays.fill(col,1);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }

        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==0 || col[j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] ={
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        setZeroes(matrix);
    }
}
