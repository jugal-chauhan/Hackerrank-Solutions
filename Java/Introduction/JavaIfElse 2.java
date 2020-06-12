import java.io.*;
import java.util.Scanner;
public class JavaIfElse 
{
    /*
    @author: Jugal Chauhan
    */
    static boolean isEven(int n) 
    { 
        boolean isEven = true; 
          
        for (int i = 1; i <= n; i++)  
            isEven = !isEven; 
              
        return isEven; 
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isEven(n)) 
        {
            if(n>=2 && n<=5)
            {
                System.out.println("Not Weird");
            }
            else if(n>=6 && n<=20)
            {
                System.out.println("Weird");
            }
            else if(n>20)
            {
                System.out.println("Not Weird");
            }
            else{
                
            }
             
        }
        else
        {
            System.out.println("Weird");
        }
    }
}

