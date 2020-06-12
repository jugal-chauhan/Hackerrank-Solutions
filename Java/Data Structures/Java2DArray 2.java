import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java2DArray 
{
    /*
    @author: Jugal Chauhan
    */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }   
        Sum(arr);  
    }
    public static void Sum(int arr[][])
    {
        int sum = -1000;
        for(int i = 0 ; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                int top = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                int middle = arr[i+1][j+1];
                int bottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if((top + middle + bottom) > sum)
                {
                    sum = (top + middle + bottom);
                }
            }
        }
        System.out.println(sum);   
    }
}
