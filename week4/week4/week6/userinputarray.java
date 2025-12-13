package week4.week4.week6;
import java.util.Scanner;


/**
 * Write a description of class userinputarray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class userinputarray
{
    public static void main (String[]arg)
    {
        
        Scanner sc= new Scanner (System.in);
         
        String[] StudentList= new String[5];
        
        for(int i=0; i<StudentList.length; i++)
        {
            System.out.println("Enter the name of the Student");
            StudentList[i]= sc.nextLine();
            
        }
        
          System.out.println("Display the name of the student");
          for( int j=0; j<StudentList.length; j++)
          {
              System.out.println("name is\t"+StudentList[j]+"\t");
          }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}