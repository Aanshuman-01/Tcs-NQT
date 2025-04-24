/* Given a number n.Find if the digit sum(or sum of digits) of n is a Paliandrome number or not.
   Note:
   A Paliandrome number is a number that stays the same when reversed.
   Example-121,131,7 etc.

   Example 1:
   Input:   n=56
   Output:  1
   Explanation:The digit sum of 56 is 5+6=11.Since,11 is a paliandrome number.Thus answer is 1.

   Example 2:
   Input:   n=98
   Output:  0
   Explanation:The digit sum of 98 is 9+8=17.Since,17 is not a paliandrome number.Thus answer is 1.
   
 
 */


package TCSNQT;
import java.util.*;
public class nqt_10 
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      while(n>0)
      {
        int k=n%10;
        sum+=k;
        n=n/10;
      }
      System.out.println("The sum of digits is:"+sum);
      int reversedNum=0;
      int temp=sum;
      while(temp>0)
      {
        int f=temp%10;
        reversedNum=reversedNum*10+f;
        temp=temp/10;
      }
      if(reversedNum==sum)
      {
        System.out.println("1");
      }
      else{
        System.out.println("0");
      }

    }

}
