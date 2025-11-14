//Calculating the sum of n natural number
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         int sum =0;
//         for(int i =1 ; i<=n; i++){
//             sum = sum + i;
//         }
//         System.out.println("the sum of "+n+" namtural no is:"+sum);
        
//     }

// }


//  table of number
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         for(int i =1;i<=10;i++){
//             System.out.println(n+"X"+i+"="+n*i);
//         }
        
//     }
// }



//pattern solid rectangle
// class pattern{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for(int j =1;j<=5 ;j++){
//                 System.out.print("*");

//             }
//             System.out.println(" ");

            
//         }


//     }
// }


// // hollow rectangle
// class pattern{
//     public static void main(String[] args) {
//         for(int i =1; i<=5;i++){
//             for (int j =1;j<=5; j++){
//                 if(i==1 || i==5 || j==1 || j==5){
//                     System.out.print("*");
//                 }
//                 else{
//                 System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }


//     }}

// half pyramid

// class pattern{
//     public static void main(String[] args) {
//         for(int i =1; i<=4;i++){
//             for(int j=1; j <=4;j++){ //or j<=i
//                 System.out.print("*");

//                 if(i==j){
//                     break;
//                 }

//             }
//             System.out.println(" ");
//         }
//     }}



//inverted half pyramid
        
        
class pattern{
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--){  
            for(int j = 1; j<=(i) ; j++){  // j<(n+i-1)
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
//  half pyramd by  character
// class pattern{
//     public static void main(String[] args) {
//         for(int i =1; i<=4;i++){
//             for(int j =1;j<=(i);j++){
//                 System.out.print(j);

//             }
//             System.out.println(" ");

// }}
// }


//inverted half pyramid by character
// class pattern{
//     public static void main(String[] args) {
//         for(int i =1;i<=4;i++){
//             for(int j =1; j<=(4-i+1);j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//     }
// }



/*
 *
 **
 ***
 ****
 ****
 ***
 **
 *
 */

//  class pattern{
//     public static void main(String[] args) {
//         for(int i =1;i<=4;i++){
//             for(int j =1; j<=i;j++){
//                 System.out.print("*");

//             }
            
//             System.out.println(" ");
//         }
//         for(int i =1;i<=4;i++){
//             for(int j =1;j<(4-i+1);j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

//or
// class pattern{
//     public static void main(String[] args) {
//         int n =4;
//         int i;
        
//         for( i =1; i<=n*2;i++){
//             int tc = i>n ? 2*n -i: i;
//             for(int j =1; j<=tc;j++){
//                 System.out.print("*");

//             }
//             System.out.println(" ");
//         }
//     }
// }

// solid daimond





// floyd triangle

// class pattern{
//     public static void main(String[] args) {
//         int a = 0;
//         for(int i =1;i<=4;i++){
//             for(int j =1; j<=i;j++){
//                 a = a+1;
//                 System.out.print(a+ " ");

//             }
            
//             System.out.println(" ");
//         }
//     }
// }



// inverted half pyramid rotated by 180

// class pattern{
//     public static void main(String[] args) {
//         for(int i =1; i<=4; i++){
//             for(int j=1 ; j<=(4-i);j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k<=i; k++){
//                 System.out.print("*");

//             }
//             System.out.println(" ");
//         }
//     }  
// }

//half pyramid with number

// class pattern{
//     public static void main(String[] args) {
//         for (int i =1 ; i<=5; i++){
//             for(int j =1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }

        
//     }
// }

// inverted pyramid by number

// class pattern{
//     public static void main(String[] args) {
//         for (int i =5 ; i>=1; i--){
//             for(int j =1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }

        
//     }
// }


// o -1 triangle
// class pattern{
//     public static void main(String[] args) {
//         for (int i =1 ; i<=5; i++){
//             for(int j =1; j<=i; j++){
//                 if ( (i+j)%2 ==0/*j==1 && i==2 || i==3 && j==2 || i == 4&& j==1|| i ==4 && j==3|| i ==5 && j==2|| i ==5 && j==4 */ ) {
//                     System.out.print("0 ");
//                 }
//                 else{
//                     System.out.print("1 ");
//                 }
//             }
//             System.out.println(" ");
//         }

        
//     }
// }

