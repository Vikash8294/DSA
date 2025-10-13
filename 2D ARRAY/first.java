import java.util.*;
public class first {
    public static void Search(int matrix[][] , int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        int max = Integer.MIN_VALUE;
        int ans = -1;
         for(int i =0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                if(matrix[i][j] == key){
                    ans = 1;

                    System.out.print( "Found at indx "+i + " "+j);

                }
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                
                
                

            }
            
        }
        if(ans ==-1){
                    System.out.println("Not Found");
                
        }
        System.out.println(" ");
        System.out.println("max of matrix is : "+max);
        

        
    }
    public static void MAXROWSUM(int matrix[][] , int n , int m ) {
        int ms = Integer.MIN_VALUE;
        
        for(int i =0; i<n; i++){
            int sum = 0;
            for(int j = 0 ; j<m; j++){
                 sum = sum + matrix[i][j];
                 
                
            }
           
            if(sum>ms){
                ms = sum;
            }
            

        }
        System.out.println(ms);
        
    
        
    }
     public static void MAXCOLSUM(int matrix[][] , int n , int m ) {
        int ms = Integer.MIN_VALUE;
        
        for(int i =0; i<n; i++){
            int sum = 0;
            for(int j = 0 ; j<m; j++){
                 sum = sum + matrix[j][i];
                 
                
            }
    
           
            if(sum>ms){
                ms = sum;
            }
            

        }
        System.out.println(ms);
        
    
        
    }

    // primary daignol sum
     public static void DiagnolSUM(int matrix[][] , int n , int m ) {
        int sum = 0;

        
        for(int i =0; i<n; i++){
            
            for(int j = 0 ; j<m; j++){
                if(i==j){
                    sum = sum + matrix[i][j]; // primary Diagonal

                } 
               else if(j == n-1-i){
                sum = sum + matrix[i][j];  // Secondary Daigonal

               }
               
                }
           
                 
                 
                
            }
            
           
            
    System.out.println(sum );
        }
        
  // optimize daignol sum
     public static void optimizeDiagnolSUM(int matrix[][] , int n , int m ) {//O(n)
        int sum = 0;

        // i = j
        // j = n-i-1
        for(int i =0; i<n; i++){
            sum = sum + matrix[i][i];
            if(i!= n-1-i){
            sum = sum + matrix[i][n-1-i];

            }
           
                 
                 
                
            }
            
           
            
    System.out.println(sum );
        }
        
    
    public static void main(String[] args) { // o(n*n)
        Scanner sc = new Scanner(System.in);
        // int matrix [][] = new int[3][3];
        // int matrix [][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int matrix [][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        int n = matrix.length;  // ROW
        int m = matrix[0].length;   //COLUMN
        
        
        // for(int i =0 ; i<n; i++){
        //     for(int j = 0 ; j<m; j++){
        //         matrix[i][j] = sc.nextInt();

        //     }
        // }

        // for(int i =0 ; i<n; i++){
        //     for(int j = 0 ; j<m; j++){
        //         System.out.print(matrix[i][j]+" ");

        //     }
        //     System.out.println();
        // }

        // ****************lenae seach ************************
        Search(matrix, 10);
// *********************************************MAxROWSUM***********************
// MAXROWSUM(matrix, n, m);

// *****************************************MAXCOLSUM********************************
// MAXCOLSUM(matrix, n, m);

// ***********************************DaignoalSum*****************
// DiagnolSUM(matrix, n, m); // primary daigionalsum

// secondarydiagonal
DiagnolSUM(matrix, n, m);

// optimize
optimizeDiagnolSUM(matrix, n, m);

    //  creating 

    
    }
    
}
