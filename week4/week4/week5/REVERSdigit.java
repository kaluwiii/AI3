package week4.week4.week5;
import java.util.Scanner; 
/** * Write a description of class REVERSdigit here. * * @author (your name) * @version (a version number or a date) */
 public class REVERSdigit 
 { 
     public static void main(String[]arg) 
     { 
         Scanner sc = new Scanner(System.in); 
         System.out.println("enter a Number"); 
         int n = sc.nextInt();
         int rev = 0;
         int palindrome=n;
         while ( n>0) 
         {
             rev = rev * 10 + n%10; 
             n= n/10; } 
             System.out.println("Reversed NUMBER IS =" + rev);
             if(rev==palindrome)
             System.out.print("the NUMBER IS PALINDROME");
             else
             System.out.print("IT ISNT");
             
            }
        }
             