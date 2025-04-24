/*  Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’
    or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any
    position in the string.
    Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

    (*>#): positive integer
    (#>*): negative integer
    (#=*): 0
    Example 1:
    Input 1:
            ###***   -> Value of S
    Output :
            0   → number of * and # are equal
 
*/


package TCSNQT;
import java.util.*;
public class nqt_36 
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int countHash=0;
       int countStar=0;

       for(char ch:str.toCharArray())
       {
        if(ch=='#')
        {
           countHash++;
        }
        else if(ch=='*')
        {
            countStar++;
        }
       }
       int result=countHash-countStar;
       if(result==0)
       {
        System.out.println("validString: "+ result);
       }
    }
}
