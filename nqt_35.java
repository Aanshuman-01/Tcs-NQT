/* FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button. A vending machine can serve range of products as follows:
  Coffee
        1.Espresso Coffee
        2.Cappuccino Coffee
        3.Latte Coffee

  Tea
        1.Plain Tea
        2.Assam Tea
        3.Ginger Tea
        4.Cardamom Tea
        5.Masala Tea
        6.Lemon Tea
        7.Green Tea
        8.Organic Darjeeling Tea

  Soups 
        1.Hot and Sour Soup
        2.Veg Corn Soup
        3.Tomato Soup
        4.Spicy Tomato Soup

  Beverages
        1.Hot Chocolate Drink
        2.Badam Drink
        3.Badam-Pista Drink

  Write a program to take input for main menu & sub menu and display the name of sub menu selected in the following format (enter the 
  first letter to select main menu):

  Welcome to CCD 
  Enjoy your
  Example 1:
  Input:c
        1
  Output
        Welcome to CCD!
        Enjoy your Espresso Coffee!

  Example 2:
  Input:t
        9
  Output
        INVALID INPUT
 
*/
package TCSNQT;
import java.util.*;
public class nqt_35 
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
       switch (ch) 
       {
        case 'C':
            int c=sc.nextInt();
            System.out.println("Welcome CCD!");
            switch(c)
            {
              case 1:
              System.out.println("Enjoy Your Espresso Coffee");
              break;

              case 2:
              System.out.println("Enjoy Your Cappuccino Coffee");
              break;

              case 3:
              System.out.println("Enjoy Your Latte Coffee");
              break;

              default:
                System.out.println("Invalid Input");
            }
            break;

        case 'T':
            int t=sc.nextInt();
            System.out.println("Welcome CCD!");
            switch(t)
            {
                case 1:
                System.out.println("Enjoy Your Plain Tea");
                break;

                case 2:
                System.out.println("Enjoy Your Assam Tea"); 
                break;  
                
                case 3:
                System.out.println("Enjoy Your Ginger Tea"); 
                break;  

                case 4:
                System.out.println("Enjoy Your Cardamom Tea");
                break;   

                case 5:
                System.out.println("Enjoy Your Masala Tea");  
                break; 

                case 6:
                System.out.println("Enjoy Your Lemon Tea"); 
                break;  

                case 7:
                System.out.println("Enjoy Your Green Tea"); 
                break;  

                case 8:
                System.out.println("Enjoy Your Organic Darjeeling Tea");  
                break;
                
                default:
                System.out.println("Invalid Input");
            }
            break;

            case 'S':
                int s=sc.nextInt();
                System.out.println("Welcome CCD!");
                switch(s)
                {
                    case 1:
                    System.out.println("Enjoy Your 1.Hot and Sour Soup");
                    break;

                    case 2:
                    System.out.println("Enjoy Your Veg Corn Soup");
                    break;

                    case 3:
                    System.out.println("Enjoy Your Tomato Soup");
                    break;

                    case 4:
                    System.out.println("Enjoy Your Spicy Tomato Soup");
                    break;

                    default:
                    System.out.println("Invalid Input");
                }
                break;

            case 'B':
                int b=sc.nextInt();
                System.out.println("Welcome CCD!");
                switch(b)
                {
                    case 1:
                    System.out.println("Enjoy Your  1.Hot Chocolate Drink");
                    break;

                    case 2:
                    System.out.println("Enjoy Your Badam Drink");
                    break;

                    case 3:
                    System.out.println("Enjoy Your Badam-Pista Drink");
                    break;

                    default:
                    System.out.println("Invalid Input");
                }
            default:
            System.out.println("Invalid Input");
            break;
       }
    }
}
