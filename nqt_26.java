/* In a company there are employees and their efficiency is given in array 'arr' (can be negative).
   You need to find the maximum efficiency of 3 employees.The efficiency of 3 employees will be 
   calculated by multiplying their individual efficiency from the given array.

   Example 1:
   5
   3 -2 -8 4 1
   Output:64

   Example 2:
   5
   4 -3 -9 5 2
 
 */

package TCSNQT;
import java.util.*;
public class nqt_26 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int emp1=arr[n-1];
        int emp2=arr[n-2];
        int emp3=arr[n-3];

        int neg1=arr[0];
        int neg2=arr[1];
       
        int maxEff=Math.max(neg1*neg2*emp1,emp1*emp2*emp3);
        System.out.println(maxEff);
    }
}
