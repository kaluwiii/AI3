import java.util.Scanner;

/**
 * Write a description of class convert here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class convert
{ public static void main(String[]arg)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the seconds You want to convert in Minutes And Hours");
      int Totalseconds = sc.nextInt();
      int hours = Totalseconds/3600;
      int remainingseconds= Totalseconds % 3600;
      int minutes= remainingseconds/60;
      int Seconds= remainingseconds %60;
      System.out.println(Totalseconds+ "seconds,"+hours+"hours,"+minutes+"minutes,"+Seconds+"Seconds");
    
    
    
    
    }
    
    
}