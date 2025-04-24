/* A party has been organised on cruise.The party is organised for a limited time(T).The number of guests entering (E[i]) and leaving (L[i])
   the party at every hour
   is represented as elements of the array.The task is to find the maximum number of guests present on the cruise at any given instance 
   within T hours.

   Example 1:
   Input: (i) 5->Value of T
          (ii)[7,0,5,1,3]->E[],Element of E[0] to E[N-1],where input each element is separated by new line
         (iii)[1,2,1,3,4]->L[],Element L[0] to L[N-1],while input each element is separated by new line.
    Output:
    8->Maximum number of guests on cruise at an instance 
 
 */

package TCSNQT;
//import java.util.*;
public class nqt_7 
{
    public static void main(String args[])
    {
      //Scanner sc=new Scanner(System.in);
      //int T=sc.nextInt();
      int T=5;
      int E[]={7,0,5,1,3};
      int L[]={1,2,1,3,4};
      int total=E[0];
      int a=0;
      for(int i=0;i<T;i++)
      {
        a=a+E[i]-L[i];
        if(a>total)
        {
            total=a;
        }
      }
      System.out.println(total);
    }
}
