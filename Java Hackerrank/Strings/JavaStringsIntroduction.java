import java.io.*;
import java.util.*;

public class JavaStringsIntroduction 
{
    /*
    @author: Jugal Chauhan
    */
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT*/
        System.out.println(A.length()+B.length());
        int len = 0;
        if(A.length() > B.length()) 
            len = B.length();
        else
            len = A.length();
        String str = "";
        for(int i = 0; i < len; i++) 
        {
            if ((int) (A.toLowerCase()).charAt(i) > (int) (B.toLowerCase()).charAt(i)) 
            {
                str = "Yes";
                break;
            } 
            else if ((A.toLowerCase()).charAt(i) < (B.toLowerCase()).charAt(i)) 
            {
                str = "No";
                break;
            }
        }
        if (str == "") //same string
        {
            if (A.length() > B.length()) 
            {
                str = "Yes";
            } 
            else 
            {
                str = "No";
            }
        }
        System.out.println(str);
        
        System.out.println((A.toUpperCase()).charAt(0) + A.substring(1, A.length()) + " " + (B.toUpperCase()).charAt(0) + B.substring(1, B.length()));


    }
}