package week4;
import java.util.Scanner;


/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The First Number");
       int firstnumber=sc.nextInt();
       System.out.println("Enter The Second Number");
       int secondnumber=sc.nextInt();
        System.out.println("Enter operators as + - * / %");
        char operator=sc.next().charAt(0);
        
        switch(operator)
        {
            case '+' : System.out.println("add is"+(firstnumber+secondnumber));
            break;
            case '-' : System.out.println("sub is"+(firstnumber-secondnumber));
            break;
            case '*' : System.out.println("multiple is"+(firstnumber*secondnumber));
            break;
            case '/' : System.out.println("divide is"+(firstnumber/secondnumber));
            break;
            case '%' : System.out.println("remainder is"+(firstnumber%secondnumber));
            break;
            default:
                System.out.println("Invalid Operator");
            
            
            
        }
        
       
       
   }
}