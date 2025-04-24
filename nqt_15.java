/*  Particulate matters are the biggest contributors to delhi pollution.The main reason behind the increase in the concentration of PMs 
    include vehicle emission by applying Odd Even concept for all tyoes vehicles.The vehicles with the odd last digit in the registration 
    number will be allowed on roads on odd dates and those with even last digit will on even dates.
    
    Given an integer array a[],contains the last digit of the registration number of N vehicles travelling on date D(A positive integer).The 
    task is to calculate the total fine collected by the traffic police department from the vehicles violating the rules.
    
    Note:For violating the rule,vehicles would be fined as X Rs.
    Constraints:
     0<N<=100
     1<=a[i]<=9
     1<=D=30
     100<=x<=5000

     The input format for testing
     The candidate has to write the code to accept 4 input(s).
     First Input-Accept for N(positive integer)values(a[]),where each value is separated by a new line.
     Third Input-Accept value for D(positive number)
     Fourth Input-Accept value for X(Positive number)
     The output format for testing
     The ouput should be a positive integer number,if no fine is collected then print "0".

     Example 1:
     Input: 4->value of N
     (5,2,3,7)->a[],Elements a[0] to a[N-1],during input each element is separated by a new line
     12->value of D,i.e date
     200->Value of x i.e.fine
     
     Output:600->total fine collected

     Explanation:
     Date D=12 means,only an even number of vehicles are allowed.
     Fine  will be collected from 5,3 and 7 with an amount of 200 each.Hence the output 600. 

     Example 2:
     Input: N=5
            (2,4,6,3,5)
            D=11
            x=100
  */

package TCSNQT;
import java.util.*;
public class nqt_15 
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
     int D=sc.nextInt();
     int x=sc.nextInt();
     System.out.println("Fine="+totalFine(N,arr,D,x));
  }   

  public static int totalFine(int N,int arr[],int D,int x)
  {
    int fine=0;
    for(int i=0;i<N;i++)
    {
       if(D%2==0)
       {
            if(arr[i]%2!=0)
            {
              fine=fine+x;
            }
       }
        else
         {
           if(arr[i]%2==0)
              fine=fine+x;           
         }
       
    }  
        if(fine==0)
        {
        System.out.println("No Fine collected");
        }    
        return fine;
  }
}
