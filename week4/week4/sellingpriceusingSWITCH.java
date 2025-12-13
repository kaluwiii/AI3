package week4.week4;
import java.util.Scanner;


/**
 * Write a description of class sellingpriceusingSWITCH here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sellingpriceusingSWITCH
{ public static void main(String[]arg)
    
    {Scanner sc=new Scanner(System.in);
        float MP, SP;
        char category;
        System.out.println("Enter the MP of the Product:");
        MP = sc.nextFloat();
        System.out.println("Enter the category 'A','B','C','D':");
        category =sc.next().charAt(0);
        int discount=0;
        switch(category)
        { case 'A':
            discount=60;
            break;
            case 'B':
                discount=40;
                break;
                case 'C':
                    discount=20;
                    break;
                    case 'D':
                        discount=10;
                        break;
                        default:
                            System.out.println("There is no such category");}
                            SP= MP-(MP * discount / 100);
                            System.out.println("Discount"+discount+"%");
                            System.out.println("Selling Price is:"+SP);
                            
            
            
            
        
                        }}