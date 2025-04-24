/* Write a program that generates a password adhering to the following conditions:
   (i)The password must consists of at least 8 characters.
   (ii)It must contain at least one integer.
   (iii)It must contain at least one special character from the set {'#','@'}.
   (iv)It must contain at least one uppercase letter and one lowercase letter.
   (v)Each character in the passwor should be incremented by the number of times specified by the second input.

   your program should take two inputs:
    1.A string representing the initial password.
    2.An integer representing the number of times each character should be incremented.
   your program should then generate the output the modified password.

   Example 1:
   Input  :werV432@
           2
   Output: ygtX654#
 
 */


package TCSNQT;
import java.util.*;
public class nqt_18 
{
    public  static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       String str=sc.nextLine();
       int value=sc.nextInt();
       String changed=modifiedString(str,value);
       System.out.println("The Modified string is:"+changed);
    }

    public static String modifiedString(String str,int value)
    {
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray())
        {
            if(Character.isLetter(ch))
            {
               if(Character.isLowerCase(ch))
               {
                  sb.append((char)(((ch-'a'+value)%26)+'a'));
               }
               else
               {
                sb.append((char)(((ch-'A'+value)%26)+'A'));
               }
            }
            else if(Character.isDigit(ch))
            {
                sb.append((char)(((ch-'0'+value)%10)+'0'));
            }
            else
            {
                if(ch=='@')
                {
                    sb.append('#');
                }
                else{
                    sb.append('@');
                }
            }
        }
        return sb.toString();
    }
}
