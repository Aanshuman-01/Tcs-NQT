/* A group of explorer is searching for treasure in a grid-based map.They have a sequence of movement instructions U for Up,D for Down,L for left 
   and R for Right.The explorers start at position (0,0).The goal is to determine their final position after executing all movements.

   Input format:
   (i)The first line contains an integer T(number of test cases).
   (ii)For each test case a single line contains a string of movements.

   Output Format:
    For each case,print the final co-ordinates(x,y).

    Input:
    3
    UUDDLRLR
    DDRRUU
    UUUDD

    Output:
    0 0
    0 2
    0 1
 
 */
package TCSNQT;
import java.util.*;
public class nqt_31 
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     sc.nextLine();
     while(n-->0)
     {
        String moves=sc.nextLine();
        int x=0,y=0;
        for(char move:moves.toCharArray())
        {
            if(move=='U') y++;
            else if(move=='D') y--;
            else if(move=='R') x++;
            else x--;
        }
        System.out.println(x+" "+y);
     }

   }   
}
