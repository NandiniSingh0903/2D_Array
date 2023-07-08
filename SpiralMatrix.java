import java.util.*;
public class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(matrix.length==0){
            return ans;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int left=0;
        int right = col-1;
        int top=0;
        int bottom = row-1;

        while(left<=right && top<=bottom){
            //to move right 
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //to move down
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                //to move left
                for(int i=right; i>=left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }          

            if(left<=right){
                //to move up
                for(int i=bottom; i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }  
        }

        return ans;
    }


    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3}, {4,5,6}, {7,8,9}
        };
        
        List<Integer> ans = spiralOrder(matrix);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
