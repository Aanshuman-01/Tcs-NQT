/*  Airport security officials have confiscated several item of the passengers at the security check point. All the items have been dumped
    into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items represent an array[]
    of N number of integer values. The task here is to sort the items based on their levels of risk in the array. The risk values range 
    from 0 to 2.
    0->Low risk
    1->Medium risk
    2->High risk
    Example 1:
    Input :7  -> Value of N
                [1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

    Output :0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

    Example 2:
    Input : 10  -> Value of N 
            [2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.

    Output : 0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

    Explanation:
    In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s. The output is a sorted array from 0 to 2 
    based on risk severity.
  
 */


 package TCSNQT;
 import java.util.*;
 public class nqt_27
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
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count_0++;
            }
            else if(arr[i]==1)
            {
                count_1++;
            }
            else
            {
                count_2++;
            }
        }
        int j=0;
        while(count_0>0)
        {
            arr[j]=0;
            j++;
            count_0--;
        }

        while(count_1>0)
        {
            arr[j]=1;
            j++;
            count_1--;
        }

        while(count_2>0)
        {
            arr[j++]=2;
            count_2--;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
     }
 }
 