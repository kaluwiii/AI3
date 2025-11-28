package week4;
import java.util.Scanner;


/**
 * Write a description of class nestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nestedif
{
   public static void main(String[]arg)
   {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter The Number");
       int num1=input.nextInt();
       if(num1%3==0)
       {
           if(num1%5==0)
           {
               System.out.println("divisible both by 3 and 5");
               
           }
           else {
               System.out.println("divisible by 3 but not by 5");
               
           }}
           else{
             if(1%5==0)
               {System.out.println("divisible by 5");
                }
                else {
                    System.out.println("not divisible  by 5 or 3");
                }
            }
    
           }
           
        
           

    
       
       
       
       
    }


