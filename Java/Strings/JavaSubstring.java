import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubstring 
{
    /*
    @author: Jugal Chauhan
    */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        char[] arr = S.toCharArray(); 
        for(int j = start; j < end; j++)
        {
            System.out.print(arr[j]);
        }
    }
}