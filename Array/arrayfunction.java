public class arrayfunction {
    public static void update(int marks[] , int nonchangeable) 
    {   nonchangeable = 10;
        for(int i =0; i<marks.length; i++){

            marks[i]= marks[i]+1;
        }
        System.out.println(nonchangeable + "in function");
        
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};  // passed by reference 
        int nonchangable = 5;  // passed by value
        update(marks, nonchangable);
        System.out.println(nonchangable);
    
        

        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
    }
    
    
}}
