public class ls {
    public static void main(String[] args) {
        String fruits []  = {"apple" , "banana", "yellow","mango"};
        String largest = fruits[0];
        for(int i = 1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                // System.out.println(largest.compareTo(fruits[i]));
                largest = fruits[i];

            }

        }
        System.out.println(largest);
    }
    
}
