/* A company has implemented a secure lock system where an N digit PIN code is checked for validity.The lock will open if:
   The sum of all digits in the PIN is divisible by 4.
   Write a program to determine if the lock will open or remain locked.
   
   Input Format:
   (i)The first line contains an integer T(number of test cases)
   (ii)Each of the next T lines contains a string PIN representing the N-digit number.

   Output Format:
   (i)Print "OPEN" if the PIN unlocks the system,otherwise print "LOCKED".
   
   Input:
   3
   1234
   5678
   1111

   Output:
   LOCKED
   LOCKED
   OPEN
 
 */



package TCSNQT;
import java.util.*;
public class nqt_32 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
          String str=sc.nextLine();
          int sum=0;

          for(char digit:str.toCharArray())
          {
           // int value=Character.getNumericValue(digit);
            //sum+=value;
            //sum+=Character.getNumericValue(digit);
            sum+=Integer.parseInt(String.valueOf(digit));
          }
          if(sum%4==0)
          {
            System.out.println("OPEN");
          }
          else
          {
            System.out.println("LOCKED");
          }
        }

    }
}
