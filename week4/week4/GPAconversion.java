package week4.week4;
import java.util.Scanner;


/**
 * Write a description of class GPAconversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPAconversion
{ public static void main(String[]arg)
    {
        Scanner sc= new Scanner(System.in);
        float GPA;
        String Grade;
        System.out.println("Enter The Obtained GPA");
        GPA=sc.nextFloat();
        if(GPA>=3.6)
        { Grade = "A";}
        else if(GPA>=3.0)
        {
            Grade="B";
        }
        else if(GPA>=2.0)
        {
            Grade="C";}
            else if(GPA>=1.0)
            {
                Grade="D";
            }
            else
            {
                Grade="F";
            }
            System.out.println("THE GRADE YOU OBTAINED IS:"+Grade);
                
            }
        }
        
        
        
    
    
    