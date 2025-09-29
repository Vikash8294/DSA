import java.util.Scanner;

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
        System.out.println("max of matrix is : "+max);
        

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i =0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                matrix[i][j] = sc.nextInt();

            }
        }

        for(int i =0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        Search(matrix, 10);
    }
    
}
