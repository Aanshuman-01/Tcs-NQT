/* Given an array of size N-1 with integers in the range of [1,N],the task is to find the missing
   number from the first N integers.
   
   Example 1:
   Input: 4
          1 2 3 5
   Output:4

   Example 2:
   Input: 3
          1 2 4
   Output:3
 */

package TCSNQT;
import java.util.*;
public class nqt_16 
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int a=n+1;
    int actual_sum=a*(a+1)/2;
    int real_sum=0;
    for(int i=0;i<n;i++ )
    {
        real_sum+=arr[i];
    }
    int missing_num=actual_sum-real_sum;
    System.out.println("the missing number is:"+missing_num);
   } 
}
