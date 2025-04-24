/* Strong numbers are the numbers whose sum of factorial of digits is equal to the original number.
   Given a number,check if it is a strong number or not.
   
   Input:n=145
   Output:Yes
   sum of digit factorials=1!+4!+5!
                          =1+24+120=145
    Input:n=534
    Output:No
 
 */

package TCSNQT;
import java.util.*;
public class nqt_6 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int originalNumber = n;
        int sum=0;
        while(n>0)
        {
            int a=n%10;
            int fact=Factorial(a);
            sum+=fact;
            n=n/10;
        }
        if(sum==originalNumber)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
    public static int Factorial(int a)
    {
        if(a==0||a==1)
        {
            return 1;
        }
        return a*Factorial(a-1);
    }
}
