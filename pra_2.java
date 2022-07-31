//This program is run by Dhruv Vekariya(21CE152)
import java.util.*;
import java.lang.String;
public class pra_2 {
    public static void startOz(String s1)
    {
        if(s1.charAt(0)=='o' && s1.charAt(1)=='z')
            {
                System.out.print(s1.charAt(0));
                System.out.println(s1.charAt(1));
            }
        else if(s1.charAt(0)=='o')
            {
                System.out.println(s1.charAt(0));
            }
        else if(s1.charAt(1)=='z')
            {
                System.out.println(s1.charAt(1));
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string :");
        String s1 = sc.next();
        startOz(s1); 
        System.out.println("This program is run by Dhruv Vekariya(21CE152)"); 
    }
}



