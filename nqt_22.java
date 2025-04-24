/* You are given an integer array nums.You are initially positioned at the array's first index, and each element in the 
   array represents your maximum jump length at that position.Return true if you can reach the last index,or false otherwise.

   Input:nums=[2,3,1,1,4]
   Output: true

   Input:nums=[3,2,1,0,4]
   Output: false
 
 */


package TCSNQT;
import java.util.*;
public class nqt_22 
{ 
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt(); 
     int arr[]=new int[N];
     for(int i=0;i<N;i++)
     {
       arr[i]=sc.nextInt();
     }
     System.out.println(MaximumJump(N,arr));
  }  

    public static boolean MaximumJump(int N,int arr[])
    {
       int max=0;
       for(int i=0;i<N;i++)
       {
        if(i>max)
        {
            return false;
        }
        max=Math.max(max,i+arr[i]);
       }
       return true;
    }
}
