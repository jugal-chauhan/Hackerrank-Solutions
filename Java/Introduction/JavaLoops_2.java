import java.util.*;
import java.io.*;

class JavaLoops_2
{
    /*
    @author: Jugal Chauhan
    */
    public static int Power(int b, int e)
    {
        int result = 1;
        while (e != 0)
        {
            result *= b;
            --e;
        }
        return result;
    }
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) 
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = a;
            for (int j = 0; j < n; j++) 
            {
                temp += (Power(2, j) * b);
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        in.close();
    }
}