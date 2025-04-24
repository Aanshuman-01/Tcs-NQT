/* 1. Sum of starting 10 Multiples of given number?
      You have given an Input N you have to print the sum value of Multiple of N(Multiplication).

      Input:n=10
      Output:550
      Explanation:10*1+10*2+10*3+10*4+10*5+10*6+10*7+10*8+10*9+10*10
     

      n(n+1)/2
 
     10^9-O(1),O(n)
     10^4,10^5-nlogn,O(n)
     10^2,10^3-O(n^2)
      */



package TCSNQT;

public class nqt_1 
{
    public static void main(String args[])
    {
        int n=10;
        int sum=0;
        for(int i=1;i<=10;i++)
        {
           sum+=n*i;
        }
        System.out.println("The output is:"+sum);
    }
}
