/* The program will recieve 3 English words inputs from STDIN

   These three words will be read one at a time, in three separate line
   The first word should be changed like all vowels should be replaced by %
   The second word should be changed like all consonants should be replaced by #
   The third word should be changed like all char should be converted to upper case
   Then concatenate the three words and print them
   Other than these concatenated word, no other characters/string should or message should be written to STDOUT

   For example if you print how are you then output should be h%wa#eYOU.

   You can assume that input of each word will not exceed more than 5 chars .

   Case 1:
    Input 1:how
            are
            you
 
    Expected Output : h*wa@eYOU

   Case 2:
    Input 1:how
            999
            you

    Expected Output : h*w999YOU
*/

package TCSNQT;
import java.util.*;
public class nqt_13 
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      String str3=sc.nextLine();
      str3=str3.toUpperCase();

      String s1="";
      String s2="";

      for(int i=0;i<str1.length();i++)
      {
        if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'||
           str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U')
        {
            s1=s1+'%';
        }
        else
        {
            s1=s1+str1.charAt(i);
        }
      }
      for(int i=0;i<str2.length();i++)
      {
        if((str2.charAt(i)>='A'&&str2.charAt(i)<='Z')||(str2.charAt(i)>='a'&&str2.charAt(i)<='z'))
        {
           if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'||
           str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U')
           {
            s2=s2+str2.charAt(i);
           }
           else
           {
            s2=s2+'#';
           }
        }
        else
        {
            s2=s2+str2.charAt(i);
        }
      }
      System.out.println(s1+s2+str3);

    }
}
