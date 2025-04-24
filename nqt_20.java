/* Check if a number ia perfect 
   Input:28
   Output:True(28 is a perfect number)
   Explanation: 28=Factors(1,2,4,7,14)
                   1+2+4+7+14=28 
 */

package TCSNQT;
import java.util.Scanner;
public class nqt_20 
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int sum=0;
       for(int i=1;i<N;i++)
       {
        if(N%i==0)
        {
            sum=sum+i;
        }
       }
       if(sum==N)
       {
        System.out.println(N+" is a perfect number");
       }
    }
}
