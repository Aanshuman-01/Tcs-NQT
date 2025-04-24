/* Given a square matrix,calculate the absolute difference bteween the sums of its diagoonals.
   1 2 3
   4 5 6
   9 8 9

   The left-to-right diagonal=1+5+9=15, The right-to-diagonal =3+5+9=17
   Their absolute difference is |15-17|=2

   Sample Input:
   3
   11 2 4
   4 5 6
   10 8 -12

   Sample Output:15
 */


package TCSNQT;
import java.util.*;
public class nqt_48 
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int [n][n];

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    } 

    int rightSum=0;
    int leftSum=0;

    for(int i=0;i<n;i++)
    {
        rightSum+=arr[i][i];
        leftSum+=arr[i][n-1-i];
    }
    int result=Math.abs(rightSum-leftSum);
    System.out.println(result);
 }   
}
