/* Given a string,remove space from it.
   Example 1:
   Input: S="geeks for geeks"
   Output:"geeksforgeeks"
   
   Example 2:
   Input: S="  g f g"
   Output:gfg
 */


package TCSNQT;
import java.util.*;
public class nqt_12 
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     str=str.trim();
     System.out.println(str);
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<str.length();i++)
     {
        if(str.charAt(i)==' ')
        {
            sb.append(str.charAt(i+1));
            i++;
        }
        else
        {
            sb.append(str.charAt(i));
        }
     }
     System.out.println(sb);
   }   
}
