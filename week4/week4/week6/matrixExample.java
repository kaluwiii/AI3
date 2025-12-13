package week4.week4.week6;
import java.util.Scanner;


/**
 * Write a description of class matrixExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class matrixExample
{
    public static void main(String[]arg)
    {
       int[][] marks =new int[2][2];//declaration of 2d array.
       Scanner sc = new Scanner (System.in);
        for(int i=0; i<2; i++)
        {
            for(int j=0;j<2;j++)
            { 
                System.out.println ("Enter the marks obtained");
                marks[i][j]=sc.nextInt();
            }
            
        }
           System.out.println("the marks obtained");
           for (int x=0;x<2;x++)
           {
             for(int y=0; y<2; y++)
             {
                  System.out.print(marks[x][y]+"\t");
             }
           
              System.out.println();
    }
      String[][] subject = new String[2][2];
      Scanner sc = new Scanner (System.in);
      for(int i=0; i<2; i++)
      
      
}  }