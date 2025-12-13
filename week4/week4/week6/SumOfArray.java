package week4.week4.week6;


/**
 * Write a description of class SumOfArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfArray
{
   public static void main(String[]arg)
   {
       
       int [] priceList={10,30,55,66,32};
       int sum=0;
       for(int addition=0; addition<priceList.length; addition++)
       {
          sum=sum+priceList[addition]; 
       }
         System.out.println("The total sum is\t="+sum);                          
       
       
       
       
       
   }
    }