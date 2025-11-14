import java.util.*;
public class countpath{
    public static int cp (int[][] grid,int i,int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i>n || j > m || grid[i][j] == 1){
            return 0 ; 
        }
        if(i == n-1 || j == m-1 ){
            return 1;
        }
        return cp(grid, i+1, j) + cp(grid, i , j+1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int [][] grid = new int[n][m];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j <m; j++){
                grid[i][j] = sc.nextInt();

            }
        }

        int ans = cp(grid,0,0);
        System.out.print(ans);
        // for(int i = 0 ; i<n ; i++){
        //     for(int j = 0 ; j <m; j++){
        //         System.out.print(grid[i][j]  + " ");

        //     }
        //     System.out.println( );
        // }
        
    }
}