package week4.week4.week6;


/**
 * Write a description of class scoresswk6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scoresswk6
{
    public static void main(String[]arg)
    {
        int [] marks = {10, 20, 30, 40, 50};
        int sum =0;
        int average= 0;
        for(int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
            sum= sum + marks[i];
        }
         System.out.println("total sum is \t" +sum);
          average= sum / marks.length;
          System.out.println("The average is"+ average);
         
         
    }
}