import java.util.*;
public class RomanToInteger {
    public static int romantTointeger(String str){
      Map<Character,Integer> m = new HashMap<Character,Integer>();
      str = str.replace("IV", "IIII");
      str = str.replace("IX", "VIIII");
      str = str.replace("XL", "XXXX");
      str = str.replace("XC", "LXXXX");
      str = str.replace("CD", "CCCC");
      str = str.replace("CM", "DCCCC");
      m.put('I',1);
      m.put('V',5);
      m.put('X',10);
      m.put('L',50);
      m.put('C',100);
      m.put('D',500);
      m.put('M',1000);
      int total = 0;
      for(int i=0;i<str.length();i++){
        total+=m.get(str.charAt(i));
      }
     return total;

    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
       System.out.println(romantTointeger(str));
    }
}
