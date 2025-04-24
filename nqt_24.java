/*  Alice and her friends are playing a game of verbal Kho-Kho.Alice is acting as a mediator,and the reset of the N friends are seated on
    N chairs,one each.
    Alice starts by providing a paper with a single-digit number to the friend present at number 1.Let's denote friends by F,where F will 
    be of size N.F[1]....F[N] represents friends seated respectively.After receiving the paper with a digit,F[1] will enact and try to tell 
    F[2] without speaking.Similarly,F[2] will communicate to the next person i.e. F[3].This continues untill last person F[N] understands the 
    digit.Finally the last person will write the digit on aseparate paper and give it to alice to compare both papers.if the digits are similar 
    then,Alice will give a T-shirt to each friend.However,if the digits do not match,Alice will ask each friend's digits,and she will offer T-shirts 
    to only those whounderstand the digits correctly.
    Given N number of friends and digit array D,denoting the digit undrstand by each friend F.Finds out how many of Alice's friends have not enacted
    well or did not understand the enactment by the previous friend correctly.
    
    Example 1:
    3-->N,number of friends
    4 4 4--array D,denoting digit understanding by N friends
    Output->0
    Expalanation:All of them understand the digits correctly

    Example 2:
    5
    1 2 3 2 2 
    Output: 4

    Explanation:1st,2nd,3rd,4th friends could not enact or understand the enactment


*/


package TCSNQT;
import java.util.*;
public class nqt_24 
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
        int count=0;
        for(int j=0;j<N-1;j++)
        {
            if(arr[0]!=arr[j+1])
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
