package week4;
import java.util.Scanner;


/**
 * Write a description of class evenodd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class evenodd
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is Odd");
    
        }
    }
}