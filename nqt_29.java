/* 1.Find avg and sum
   2.Find number of paliandriomes in range M to N(M and N are integer)
   
   Input:A=100,B=150
   Output:[101,111]
 */


package TCSNQT;
import java.util.*;
public class nqt_29 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();

        List<Integer> result=findPaliandrome(A,B);
        for(int num:result)
        {
            System.out.print(num+" ");
        }
    }

    public static List<Integer> findPaliandrome(int A,int B)
    {
        ArrayList<Integer> palian_num=new ArrayList<Integer>();
        for(int i=A;i<=B;i++)
        {
            if(IS_paliandrome(i))
            {
             palian_num.add(i);
            }
        }
        return palian_num;
    }

    public static boolean IS_paliandrome(int i)
    {
        int res=0;
        int num=i;
        while(i>0)
        {
          int rem=i%10;
          res=rem+res*10;
          i=i/10;
        }
        if(num==res)
           return true;
        else
           return false;
    }
}
