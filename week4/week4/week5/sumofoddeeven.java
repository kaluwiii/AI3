package week4.week4.week5;


/**
 * Write a description of class sumofoddeeven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sumofoddeeven
{
    public static void main(String[]arg)
    {
       System.out.print("SUM OF ODD AND EVEN");
       int even_sum =0;
       int odd_sum= 0;
    
       for(int i=1; i<=10; i++)
                 {if (i%2==0)
                     even_sum= even_sum + i;
                     else 
                        odd_sum= odd_sum + i;
                    }
                    System.out.println("SUM OF even =" +even_sum);
                    System.out.println("SUM OF ODD =" +odd_sum);
                     
    }
}