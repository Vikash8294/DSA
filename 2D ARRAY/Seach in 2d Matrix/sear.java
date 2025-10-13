

public class sear {
    public static void Search(int matrix [][], int n , int m ,int key) {
        int s = 0;
        int e = m-1;
        int ans = -1;
        while(s<=e){//O(log m)
            int mid = s+(e-s)/2;
            if(matrix[mid][0] <= key && key  <= matrix[mid][n-1]){
                int st = 0;
                int en = n-1;
                while(st<=en){ //O(lon(n))
                    int md = st + (en-st)/2 ;
                    if(matrix[mid][md] == key){
                        System.out.println("FOUND AT ROW  "+mid+"  FOUND AT COL: "+ md);
                        return;
                    }
                    else if(matrix[mid][md] < key){
                        st = md +1;
            
                    }
                    else{
                        en = md -1;
                    }
                }
                break;


            }
            else if (matrix[mid][n-1] <=key) {
                s = mid +1;
                
            }
            else{
                e =mid -1;

            }
        }
        System.out.println(ans  );
        
    }
    public static void main(String[] args) {
        int matrix[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int m = matrix.length;
        int n = matrix[0].length; 
        int key = 20;
        Search(matrix, n, m, key);
    }
}
// time complexcity is O(log(m) + log(n)) => O (log (n*m))