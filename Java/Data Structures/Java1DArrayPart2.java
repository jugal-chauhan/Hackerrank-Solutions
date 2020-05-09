import java.util.*;
import java.io.*;

public class Java1DArrayPart2 
{
    /*
    @author: Jugal Chauhan
    */
    public static boolean canWin(int leap, int[] game) 
    {
        return canWin(leap, game, 0);
    }

    public static boolean canWin(int leap, int[] g, int i) 
    {
        if(i < 0 || g[i] == 1) 
        {
            return false;
        }
        if(i + leap >= g.length || i == g.length - 1) 
        {
            return true;
        }
        g[i] = 1;
        return canWin(leap, g, i + 1) || canWin(leap, g, i + leap) || canWin(leap, g, i - 1);
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) 
        {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) 
            {
                game[i] = scan.nextInt();
            }
            if(canWin(leap, game))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}