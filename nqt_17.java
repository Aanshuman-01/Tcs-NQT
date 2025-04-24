/* write a program to take input of x and y in a new line.Print the number which is nearer the integer when divided by y.
   Example 1 :
   Input:x=13
         y=3
   Output: 12
   Explanation: 12 is the closest to 13, divisible by 4.

   Input: x=-15, y=6
   Output: -18
   Explanation: Both -12 and -18 are closest to -15, but-18 has the maximum absolute value.

   Input: x=7, y=2
   Output: 6 or 8
 
 */

package TCSNQT;
import java.util.*;
public class nqt_17 
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    double answer=x/y;
    int nearest=calculate(answer);
    System.out.println(nearest*y);
   }  

   public static int calculate(double answer)
   {
     int integerpart=(int)answer;
     double decimalPart=answer-integerpart;

     if(decimalPart>=0.5)
     {
        return integerpart+1;
     }
     else
     {
        return integerpart;
     }
   }
}
/*import java.util.Scanner;

public class NearestMultiple {
    public static int nearestMultiple(int x, int y) {
        // Calculate the quotient of the division
        int quotient = x / y;
        
        // Two nearest multiples of y
        int lowerMultiple = y * quotient;      // The smaller multiple
        int upperMultiple = y * (quotient + 1); // The larger multiple
        
        // Find the distance between x and the two multiples
        int lowerDistance = Math.abs(x - lowerMultiple);
        int upperDistance = Math.abs(x - upperMultiple);
        
        // Return the multiple that is closer to x
        if (lowerDistance <= upperDistance) {
            return lowerMultiple;
        } else {
            return upperMultiple;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take inputs for x and y
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        
        // Find the nearest multiple of y
        int result = nearestMultiple(x, y);
        
        // Print the result
        System.out.println("The nearest multiple of " + y + " to " + x + " is: " + result);
    }
}
 */