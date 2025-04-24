/* Given an array Arr[] of N integers and a positive integer K.The task is to rotate the array
   clockwise by k.

   Example 1:
   5-->Value of N
   {10,20,30,40,50}-->Element ofArr[]
   2-->Value of k

   output:
   40 50 10 20 30
    
   Example 1:
   4-->Value of N
   {10,20,30,40}-->Element of Arr[]
   1-->Value of k

   Output:
   40 10 20 30
 
 */

package TCSNQT;
import java.util.*;
public class nqt_43 
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int k=sc.nextInt();
    int arr[]=new int[N];
    for(int i=0;i<N;i++)
    {
        arr[i]=sc.nextInt();
    }
    if(k>N)
    {
        k=N%k;
    }

    for(int i=N-k;i<N;i++)
    {
        System.out.print(arr[i]+" ");
    }

    for(int i=0;i<N-k;i++)
    {
        System.out.print(arr[i]+" ");
    }
   }     
}
