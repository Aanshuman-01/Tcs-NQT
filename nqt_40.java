/* Alice has a very unique problem.He has a string which contain elements for 0 to 9.Find the number of substring of the string
   where sum of elements of the substring is not equal to the length of substring.
                                      
                          substring   length  sum of the substring   
   Input 1:                       2   1          2
   3-->length of string           0   1          0
   201-->string                   1   1          1
                                  20  2          2
   Output 1:                      01  2          1 
   2                              201 3          3
 
 */



package TCSNQT;
import java.util.*;
public class nqt_40 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();

        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=str.charAt(j)-'0';
                int length=j-i+1;

                if(sum!=length)
               {
                   count++;
               }
            }
        }
        System.out.println(count);
    }
}
