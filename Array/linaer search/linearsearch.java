
import java.util.Scanner;

public class linearsearch {

     // **************************************direct method *********************************


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     System.out.println("enter the size of array");
    //     int size = sc.nextInt();
    //     int numbers[] = new int[size];

    //     //input
    //      for(int i =0; i<numbers.length; i ++){
    //         System.out.println("Enter the number at index "+ i );
    //         numbers[i]= sc.nextInt();
        
    //     }
    //     // the seaching number
    //     System.out.println("enter the seaching number ");
    //     int num = sc.nextInt();
        

    //     //output
    //     System.out.println("the output of array  is  : ");
    //      for(int i =0; i<numbers.length; i ++){
    //         System.out.print(numbers[i]+ " ");
            
            
    //     }
    //     // liner search 

    //     for(int i =0; i<numbers.length; i ++){
    //         if(numbers[i] == num){
    //             System.out.println(" the number is at index "+i );

    //         }
            
    //     }

    // }


    // **********************************function*******************************************

    public static int LinerS(int num[], int key) {
        for(int i =0 ; i<num.length; i++){
            if (num[i]== key){
                return i;
            }
                 }

        return -1;



        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [] = {2,4,6,8,10,12,14,16};
        int key = 12;
        int index = LinerS(num, key);
        if(index == -1){
            System.out.println( " Number NOT FOUND");
        }
        else{
            System.out.println("Found at :"+ index);
        }
    }
}
