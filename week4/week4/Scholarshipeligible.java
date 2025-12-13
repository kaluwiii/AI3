package week4.week4;
import java.util.Scanner;


/**
 * Write a description of class Scholarshipeligible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scholarshipeligible
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner (System.in);
        float GPA, Attendence;
        int Attitude;
        System.out.println("Enter the gpa obtained");
        GPA=sc.nextFloat();
        System.out.println("Rate The attitude range from 1-10");
        Attitude=sc.nextInt();
        System.out.println("Enter students Attendence");
        Attendence=sc.nextFloat();
        if(GPA>=3.2)
        {if (Attitude<5){
            if(Attendence>80){ System.out.println("The Student is Eligible for Scholarship");}
        }else{
                system.out.println("Not Eligible:The Obtained GPA is too low");}
            }else{
                    System.out.println("Not Eligible:Attitude Score is high");}}
            else{
                
                    System.out.println("NOT ELIGIBLE:Attendence too low");
                    
                }
            }
            
            
                
            
            
            
        
        
        
        
    }
