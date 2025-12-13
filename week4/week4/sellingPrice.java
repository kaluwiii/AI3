package week4.week4;
import java.util.Scanner;


/**
 * Write a description of class sellingPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sellingPrice
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        float MP, SP;
        char category;
        System.out.println("Enter the MP of the Product:");
        MP = sc.nextFloat();
        System.out.println("Enter the category 'A','B','C','D':");
        category =sc.next().charAt(0);
        int discount=0;
        if(category=='A')
        {
            discount=60;
        } else if(category=='B')
        { discount=40;}
        else if(category=='C')
        {
            discount=20;
        }
        else if(category=='D')
        {
            discount=10;
        }else {
            System.out.println("The category you ve entered is Not available");
        }
        SP= MP - (MP * discount /100);
        System.out.println("Discount Of the product is"+discount);
        System.out.println("Selling price of the product is:"+SP);
        
            
        }
    
        
            
        
        
        
        
        
    
}