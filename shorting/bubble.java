class bubble{
    public static void bs(int num[]) {
        boolean isSwaped = false;
        for(int turn =0; turn<num.length-1; turn++){
            for(int j = 0; j<num.length -1 -turn; j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    isSwaped = true;

                    

                }
            }
            

        }
        if(!isSwaped){ // to make the bubble sort more optimize
            System.err.println("Allready swaped");
            return;
        }
        for(int i =0; i<num.length;i++){
            System.out.print(num[i]);
        }
        System.out.println(" ");
        
    }

    public static void db(int num[]) {
        for(int i =0; i<num.length-1; i++){
            for(int j =0; j<num.length-1-i; j++){
                if(num[j] < num[j+1]){
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
            }
        }

        }
        for(int i =0; i<num.length;i++){
            System.out.print(num[i]);
        }
        
    }
    public static void main(String[] args) {
        int num[]= {5,4,1,3,2,6};
        // int num[]= {1,2,3,4,5};
        bs(num);
        db(num);
        
    }
}