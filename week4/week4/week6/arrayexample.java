package week4.week4.week6;


/**
 * Write a description of class arrayexample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrayexample
{
    public static void main (String[]arg)
    {
       int[]age; // array declaration
       age=new int[5];// array construction.
       
       age[0]= 13;
       age[1]= 15;
       age[2]= 16;
       age[3]= 21;
       age[4]= 34;
       
       System.out.println(age[0]);
       System.out.println(age[1]);
       System.out.println(age[2]);
       System.out.println(age[3]);
       System.out.println(age[4]);
       
       int []number= new int[5];
       int x=10;
       
       for(int i=0; i<number.length; i++)
       {
           number[i]=x;
           x=x+10;
           
        }
        
        System.out.println(" Dispaly using loop");
        for(int y=0;y<number.length; y++)
        {
            System.out.println(number[y]);
        }
       
    }
}