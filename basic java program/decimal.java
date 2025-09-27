import java.util.*;
public class decimal {
    public static void  calBinToDec(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        int decNum = sc.nextInt();
        int original = decNum;
        int power = 1;
        int ans =0;
        while(decNum>0){
            int rem = decNum % 10;
            decNum = decNum / 10;
            ans = ans+ rem*power;
            power=power*2;


        }
       
        System.out.println("The Converted Decimal Number of "+ original +" is "+ans);

    }
    public static void main(String[] args) {
        calBinToDec();
     
    }
}
