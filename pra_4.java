//This program is run by Dhruv Vekariya(21CE152)
import java.util.*;
import java.lang.String;
public class pra_4 
{
    public static boolean array123(int[] a) {
        for(int i = 0; i <a.length - 2; i++) {
           if(a[i] == 1 && a[i + 1] == 2 && a[i + 2] == 3){
               return true;
           }
       }
       return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many size of array : ");
        int size = sc.nextInt();
        int []a =  new int[size];
        for(int i=0; i<size; i++)  
        {  
            a[i]=sc.nextInt();  
        }
        System.out.println(array123(a));
        System.out.println("This program is run by Dhruv Vekariya(21CE152)");
    }
}
