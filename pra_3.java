//This program is run by Dhruv Vekariya(21CE152)
import java.util.*;
import java.lang.String;
public class pra_3 {
    public static boolean lastDigit(long a, long b)
    {
        long c = a%10;
        long d = b%10;
        if(c==d)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two digits :");
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(lastDigit(a,b));
        System.out.println("This program is run by Dhruv Vekariya(21CE152)");
    }
}
