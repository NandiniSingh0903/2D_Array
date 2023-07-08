public class KWeakestRowsInAMatrix {
    static int[] kWeakestRows(int[][] mat, int k) {
        int c=0;
        int count=0;
        int arr[] = new int[mat.length];
        int ans[] = new int[k];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            arr[c++] = count;
            count=0;
        }

        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int minIndex =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            ans[i] = minIndex;
            arr[minIndex] = Integer.MAX_VALUE;
        }

        return ans;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };

        int ans[] = kWeakestRows(matrix, 3);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
