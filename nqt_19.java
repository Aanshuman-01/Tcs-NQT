/* Given size of n and list of array elements and we should print if the given element in array is divisible by 3 then replace the element
   with "Three" and if the element in array is divisible by 5 then replace the element with "five" if the element is divisible by 3 and 5 
   both then replace the element with "ThreeFive" if the element in the array is not satisfying the above 3 conditions then put the element
   as it is and print the array.
   
   Example 1:
   Input: N=4
          [2 3 4 5]
   Output: 2 Three 4 Five
   
   Example 2:
   Input: N=2
          [15 3]
   Output: ThreeFive Three
 
*/

package TCSNQT;
import java.util.*;
public class nqt_19 
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
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<N;i++)
       {
        if(arr[i]%3==0 && arr[i]%5==0)
        {
            sb.append("ThreeFive"+ " ");
        }
        else if(arr[i] % 3==0)
        {
            sb.append("Three" + " ");
        }
        else if(arr[i]%5==0)
        {
            sb.append("Five"+" ");
        }
        else
        {
            sb.append(arr[i]+" ");
        }
       }
       System.out.println(sb);

    }
}
