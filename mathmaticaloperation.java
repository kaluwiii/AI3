import java.util.Scanner;

/**
 * Write a description of class mathmaticaloperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathmaticaloperation
{ public static void main(String[]arg)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter The Marks Obtained");
     int marks = sc.nextInt();
     String result= (marks >= 40) ? "pass": "fail";
     System.out.println("The marks Obtained is "+marks+"/n"+" Hence The student Is" +result);
    }
    
     
     
     

}
  
  
