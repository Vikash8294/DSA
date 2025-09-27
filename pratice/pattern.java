// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =5 ;
//         for(int i =1 ;i <= n; i++){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
                
//             }
//             for(int k = 1; k<=i; k++){
//                 System.out.print("*");
//             }
//             for(int q =2 ; q<=i; q++){
//                     System.out.print("*");
//                 }
//                   System.out.println(" ");
//         }
//             for(int i =n ;i >=1; i--){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
                
//             }
//             for(int k = 1; k<=i; k++){
//                 System.out.print("*");
//             }
//             for(int q =2 ; q<=i; q++){
//                     System.out.print("*");
//                 }
//                   System.out.println(" ");
//         }



import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k = i; k>=1; k--){
                System.out.print(k+" ");
            }
            for(int l = 2; l<=i ; l++){
                System.out.print(l+" ");
            }
            System.out.println(" ");
        }
    
    }}

        //biuterflu

//            for(int i=1; i<=n; i++){
//             for(int j = 1 ; j<=i; j++){
//             System.out.print( "*");  
//             }
//             for(int k = 1; k<=2*(n-i); k++){
//                 System.out.print(" ");
//             }
//             for(int l =1; l<=i; l++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
// }  
//            for(int i=n; i>=1; i--){
//             for(int j = 1 ; j<=i; j++){
//                 System.out.print( "*");    
//             }
//             for(int k = 1; k<=2*(n-i); k++){
//                     System.out.print(" ");
//                 }
//                 for(int l = 1 ;l<=i; l++){
//                     System.out.print("*");
//                 }
//                 System.out.println(" ");
//             }
    

//     }}

        /// rotateed half pyramid
        
        

    //     for(int i=1; i<=n; i++){
    //         for(int j = 1 ; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         for(int k = 1; k<=i; k++){
    //                 System.out.print(i+" ");

    //             }
    //             System.out.println(" ");
    //         }
            
    //     }
    // }



    // holow rectangle



    //     for(int i = 1; i<=n; i++){
    //         for(int j =1 ; j<=5; j++){
    //             if((i == 2 && j ==2 ) || (i ==2 && j==3 ) || (i ==2 && j==4 )|| (i ==3 && j==2 ) || (i ==3 && j==3 ) || (i ==3 && j==4 )){
    //                 System.out.print(" ");

    //             }
    //             else{
    //                 System.out.print("*");
    //             }
                
    //         }
    //         System.out.println(" ");
    //     }




    // }
    // }



    // 0 and 1 pyramid


        // Scanner sc = new Scanner(System.in);
        // int n =5 ;
        // int a = 0;
        // for(int i =1 ;i <= n; i++){

        //     for(int j = 1; j<=i; j++){
        //         if((i+j)%2==0){
        //             System.out.print("1");

        //         }
        //         else{
        //             System.out.print("0");
        //         }
                
                
                
        //     }
        //           System.out.println(" ");
        // }




// pyramid 

        // for(int i =4 ;i >= 1; i--){
        //     for(int j = 1; j<=i; j++){
        //             System.out.print("* ");
                
        //     }
            
        //     System.out.println(" ");
        // }
        
//     }
// }
    


// 


//   for(int p =n ;p >= 1; p--){
//             for(int q = 1; q<=n-p; p++){
//                 System.out.print(" ");
                
//             }
//             for(int m = 1; m<=p; m++){
//                 System.out.print("*");
//             }
//         }
