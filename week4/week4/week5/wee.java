package week4.week4.week5;
import java.util.Scanner;


/**
 * Write a description of class we here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wee 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER ANY NUMBER");
        int num = sc.nextInt();
        int even = 0;
        int odd =0;
        while(num!=0)
         { int digit = num % 10;
              if ( digit %2 == 0)
                 even ++;
                 else 
                   odd++;
                num = num / 10;
            }
                   
                   System.out.println("EVEN DIGIT=" + even);
                   System.out.println("ODD DIGIT =" + odd);
                }
        
            }