import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // int [] marks = new int[3];

        // int marks [] = new int[3];

        // or **************************

        // int marks[] = {97,98,96};




        // marks[0] = 98;
        // marks[1] = 97;
        // marks[2] = 96;


// System.out.println(marks[0]);
// System.out.println(marks[1]);
// System.out.println(marks[2]);

// or

// for (int i = 0; i < 3; i++){
//     System.out.println(marks[i]);
// }



//************************************************ */ Creating arrayn by taking user input**************************************

Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array");
int size = sc.nextInt();
int numbers [] = new int[size];


//input
for(int i = 0 ; i<size; i++){
    numbers[i] = sc.nextInt();
}

// output
for(int i = 0; i<size; i++){
    System.out.println("the output of index "+ i + "is : " +  numbers[i]);
}

    }
}
