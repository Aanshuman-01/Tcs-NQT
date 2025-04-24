/* A secret organization sends encrypted messages where each letter is replaced with its frequency of occurences in the message.
   If multiple letters have the same frequency,they should appear in alphabetical order.
   Write a program to decode the secret message by mapping each character to its frequency.

   Input Format:
   (i)The first line contains an integer T(number of test cases)
   (ii)Each of the next T lines contains a string S (the secret message consisting of lowercase English letters).

   Output Format:
   ()For each test case,Print the decoded message in the format:
     char1:freq1 char2:freq2

       (o)The characters should be sorted in ascending order.
       (o)Each character-frequency pair should be separated by a space.

    Constraints:
      (O)1<=T<=10
      (O)1<=|S|<=1000

    Input:
    2 
    hello
    mississippi

    Ouput:
    e:1 h:1 l:2 o:1
    i:4 m:1 p:2 s:4
 
 */

package TCSNQT;
import java.util.*;
public class nqt_33 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
          String str=sc.nextLine();
          TreeMap<Character,Integer> map=new TreeMap<>();
          for(char ch:str.toCharArray())
          {
            map.put(ch,map.getOrDefault(ch,0)+1);
          }
          StringBuilder sb=new StringBuilder();
          for(Map.Entry<Character,Integer> entry:map.entrySet())
          {
            //System.out.print(entry.getKey()+":"+entry.getValue()+" ");
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(" ");
          }
          System.out.println(sb);
        }
    }
}
