//This program is run by Dhruv Vekariya(21CE152)
import java.util.*;
import java.lang.String;
public class pra_5 
{

    public static int stringMatch(String a1, String a2) {
          int length;
          if(a1.length()<a2.length())
          {
            length=a1.length();
          }
          else
          {
            length=a2.length();
          }
          int ans = 0;
          for (int i = 0; i < length-1; i++){
            String substra1 = a1.substring(i, i+2);
            String substra2 = a2.substring(i, i+2);
            if (substra1.equals(substra2))
              ans++; 
          }
          return ans;
        } 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string :");
        String a1 = sc.next();
        System.out.println("Enter second string :");
        String a2 = sc.next();
        System.out.println(stringMatch(a1,a2));
        System.out.println("This program is run by Dhruv Vekariya(21CE152)");
    }
}
