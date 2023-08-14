import java.lang.StringBuffer;
import java.util.Scanner;
public class IntegerToRoman {
    public static String integerToRoman(int n){
       int num[] ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       StringBuffer rom = new StringBuffer();
       for(int i=0;i<num.length;i++){
      while(n>=num[i]){
        n = n-num[i];
        rom.append(roman[i]);

      }
    }
      return rom.toString();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(integerToRoman(n));
    }
}
