import java.util.ArrayList;
import java.util.List;

public class spraialmatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int sr = 0;
        int er = m-1;
        int sc = 0;
        int ec = n-1;
        while(sr<=er && sc <= ec){
            //right
            for(int i = sc ; i<=ec; i++){
                ans.add(matrix[sr][i]);
                
            }
            //bottom
            for(int j = sr+1 ; j<=er; j++){
                ans.add(matrix[j][ec]);
                
            }
            //right
            for(int k = ec-1 ; k>=sc; k--){
                if(sr == er){
                    break;

                }
                ans.add(matrix[er][k]);
                
            }
            //top
            for(int l = er-1 ; l>=sr+1; l--){
                if(sc == ec){
                    break;
                }
                ans.add(matrix[l][sc]);
                
            }
            sr++;
            sc++;
            er--;
            ec--;

        }
        
    return ans;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralOrder(matrix));
        
    }
}
