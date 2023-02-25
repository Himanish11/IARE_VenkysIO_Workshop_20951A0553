import java.util.Scanner;
public class String_Reversal_Recursion
{
    static void reverse(String str) 
    { 
        if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); 
        else
        { 
            System.out.print(str.charAt(str.length()-1)); 
            reverse(str.substring(0,str.length()-1)); 
        }         
    }   
    public static void main(String args[]) 
    { 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String :");
            String str = sc.nextLine();   
            System.out.println("The reverse of the entered the String :");
            reverse(str);
        } 
    }     
}
