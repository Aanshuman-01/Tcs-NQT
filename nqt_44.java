/* Given Two binary numbers (in 0 and 1) in the form of string.Find out whether there is a possibility
   whether these numbers can become equal by rearranging their respectiive 0s and 1s.

   For ex:101 and  011 can be arranged within themselves to become either 101 or 011.

   Example 1:
   3-->Length of input string 
   101-->input string 1
   011-->input string 2

   Output 1:Yes
 
 */

package TCSNQT;
import java.util.*;
public class nqt_44 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        String str1=sc.next();
        String str2=sc.next();

        if(str1.length()!=str2.length())
        {
            System.out.println("NO");
        }

        int countS1_0=0, countS1_1=0;
        int countS2_0=0, countS2_1=0;

        for(int i=0;i<length;i++)
        {
            if(str1.charAt(i)=='1')
            {
                countS1_1++;
            }
            else
            {
                countS1_0++;
            }
            if(str2.charAt(i)=='1')
            {
                countS2_1++;
            }
            else
            {
                countS2_0++;
            }
        }
         if(countS1_0==countS2_0 && countS1_1==countS2_1)
         {
            System.out.println("Yes");
         }
         else
         {
            System.out.println("No");
         }

    }
}
