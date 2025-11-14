// leet 74

public class se {
    public static boolean search(int matrix[][] , int target) { // O(n+m)
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n-1;
        while(c>=0 && r < m){
            if(matrix[r][c] == target ){
                return true;
            }
            else if (matrix[r][c] > target){
                c = c-1;
            }else{
                r = r+1;
            }
        }
    return false; 
}
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int  target = 60;
        boolean s =search(matrix, target);
        System.out.println(s);

        
    }
}
