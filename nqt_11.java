/* Given an array arr of size n.swap the kth element from the beginning with kth element from the end.
    Example 1:
    Input:n=8
          k=3
          arr[]={1,2,3,4,5,6,7,8}
    Output:{1,2,6,4,5,3,7,8}
    Explanation:3rd element from the beginning is 3 and from end is 6.

    Example 2:
    Input:n=5
          k=2
          arr[]={5,3,6,1,2}
    Output:{5,1,6,3,2}
    Explanation:2nd element from the beginning is 3 and from end is 1.
    
 
 */



package TCSNQT;
import java.util.*;
public class nqt_11 
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      int temp=arr[k-1];
      arr[k-1]=arr[n-k];
      arr[n-k]=temp;
      for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]+" ");
      }
    }
}
