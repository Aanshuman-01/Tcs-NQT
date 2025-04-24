/* Jack and Jill are playing a string game. Jack has given Jill two strings A and B. Jill has to derive a string C from A, by deleting 
   elements from string A, such that string C does not contain any element of string B. Jill needs help to do this task. She wants a 
   program to do this as she is lazy. Given strings A and B as input, give string C as Output.
  
   Example 1:
   Input:
   tiger -> input string A
   ti    -> input string B

   Output:
   ger       -> Output string C
   Explanation:
   After removing “t” and “i” from “tiger”, we are left with “ger”.
   So, the answer is “ger”.

   Example 2:
   Input:
   processed     -> input string A
   esd           -> input string B
   
   Output:
   proc          -> Output string C
   Explanation:
   After removing “e” “s” and “d” from “processed”, we are left with “proc”.
   So, the answer is “proc”.
  
   Example 3:
   Input:
   talent        -> input string A
   tens          -> input string B
   Output:
   al            -> Output string C
   
   Explanation:
   After removing “t” “e” and “n” from “talent”, we are left with “al”.
   So, the answer is “al”.
 
*/

package TCSNQT;
import java.util.*;
public class nqt_39
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    String A=sc.nextLine();
    String B=sc.nextLine();

    HashSet<Character> hs=new HashSet<>();
    for(char ch:B.toCharArray())
    {
        hs.add(ch);
    }

    StringBuilder sb=new StringBuilder();
    for(char ch:A.toCharArray())
    {
        if(!hs.contains(ch))
        {
            sb.append(ch);
        }
    }
    System.out.println(sb);
   } 
}
