package week4;
import java.util.Scanner;


/**
 * Write a description of class ResultsSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResultsSystem
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Percentage");
        int percentage=sc.nextInt();
        if((percentage<=100) && (percentage>=90))
        {
            System.out.println("Distinction");
        }
        else if((percentage>=70) && (percentage<90))
        {
            System.out.println("First Division");
        }
        else if((percentage>=56) && (percentage<70))
        {
            System.out.println("Second Division");
            
        }
        else if((percentage>=40) &&(percentage<56))
        {
            System.out.println("Third Division");
        
        }
        else
        {
            System.out.println("HE/SHE Failed");
        }
            
        
    
    }
}