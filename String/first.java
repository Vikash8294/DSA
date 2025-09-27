



public class first {
    public static void main(String[] args) {


  
    
        // crete 
        // 1. direct method
        // String name = "vikash";
        // System.out.println(name);

        // // 2. using new keyword
        // String str = new String("Prince");
        // System.out.println(str);



        // //  INPUT AND OUTPUT*********************************************************
        // Scanner sc = new Scanner(System.in);
        // // String sch = sc.next(); // only take input as word
        //  String sch = sc.nextLine(); // take the whole line as input

        // System.out.println("School name is "+ sch);




        // Function ********************************************************
        // 1.length

        // String name = "vikash Singh";
        // System.out.println(name.length()); // it also count the space


        // 2. concatnation
        // String fname = "vikash";
        // String lname = "Singh";
        // String fullNmae = fname + " " + lname;
        // System.out.println(fullNmae);

        // comparison ************************************************************************************

        // only equal or not we can find  like in c++ it can we done directly here we have to use .compareTo


        // String fname = "Sikash";
        // String lname = "Vikash";
        // System.out.println(fname == lname); 
        // int result = fname.compareTo(lname);
        // if(result < 0){
        //     System.out.println(fname + " comes before "+ lname);

        // }
        // else if(result > 0){
        //     System.out.println(fname + " comes after "+ lname);
        // }else{
        //     System.out.println("Both Are Equla");
        // }
    


        // chartAt Funtion****************************************

        // chart At is Method that return Character At Specific indeex in string
        // String fname = "Sikash";
        // String lname = "Vikash";
        // String fullNmae = fname + " " + lname;
        // // System.out.println(fullNmae.charAt(7));

        // // loop in string
        // for(int i =0; i < fullNmae.length(); i++){
        //     System.out.print(fullNmae.charAt(i)+ " ");
        // }
        // System.out.println(" ");



 // conparision***********************************

    String s1 = "Vikash";
    String s2 = "Vikash";
    String s3 = new String("Vikash");
    // if(s1 == s2){
    //     System.out.println("true");

    // }else{
    //     System.out.println(false);
    // }

    if(s1.equals(s3)){
        System.out.println("true");

    }else{
        System.out.println(false);
    }

    System.out.println(s1.equals(s3));
  





    }


    
}
