/* A plumber wants to check whether a pipe junction where N incoming pipes and M outgoing pipes are balanced, and, if not, 
   needs to balance the junction by adding an input pipe or an output pipe of a suitable capacity. At the junction, there are a 
   set of input pipes and a set of output pipes. Each pipe has a rated capacity and an actual capacity. The actual capacity for 
   each pipe is lower than the rated capacity by a constant R, the "rust factor", which depends on the material of the pipe, and 
   is the same for all the pipes at the junction.

   For example, if the rated capacity is 65, and R is 2, the actual capacity is 63.

   A junction is balanced if the sum of the actual capacities of the input pipes is the same as the sum of the actual capacities 
   of the output pipes. If it is not balanced, the plumber needs to add one input pipe or one output pipe to balance the junction,
   and determine the rated capacity of that added pipe.

   Here we have N incoming pipes and M outgoing pipes. The incoming pipes may be of different rated capacities. Similarly, the 
   outgoing pipes may also be of different rated capacities.

   Find the rated capacity of the pipe required to make the junction balanced. If the combined actual capacity of the incoming 
   pipes is more than the combined actual capacity of the outgoing pipes then the plumber will need to add an outgoing pipe. 
   Conversely, if the combined actual capacity of the incoming pipes is less than the combined actual capacity of the outgoing 
   pipes then the plumber will need to add an incoming pipe.

   If an outgoing pipe is added then denote its rated capacity as a negative number. If an incoming pipe is added then denote its 
   rated capacity as a positive number.

  Input:
  The input has three lines
  The first line contains three space separated integers N M R denoting the number of incoming pipes, outgoing pipes and rust 
  factor respectively.
  The second line contains N space separated integers denoting the rated capacity of each incoming pipe.
  The third line contains M space separated integers denoting the rated capacity of each outgoing pipe.

  Output:
  Print the rated capacity of the pipe required to balance the junction OR print "BALANCED" if the junction is already balanced.


  Example 1 :
  Input:
  3 3 2
  85 75 95
  70 80 45

  Output:
 -62

  Explanation:
  There are 3 input pipes, 3 output pipes, and the rust factor is 2. The rated capacities of the input pipe are 85,75 and 95 respectively.
  The rated capacities of the output pipes are 70,80 and 45 respectively.
  Here, it will be required to add an outgoing pipe with rated capacity 62. Hence the output is -62.

  Example 2 :
  Input:
  5 6 1
  10 26 33 40 50
  20 7 53 25 45 10

  Output:
  BALANCED
*/


package TCSNQT;
import java.util.*;
public class nqt_45 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int Incpipe_no=sc.nextInt();
    int Outpipe_no=sc.nextInt();
    int rustF=sc.nextInt();

    int IncomePipe[]=new int[Incpipe_no];
    for(int i=0;i<IncomePipe.length;i++)
    {
        IncomePipe[i]=sc.nextInt();
    }

    int OutgoingPipe[]=new int[Outpipe_no];
    for(int i=0;i<OutgoingPipe.length;i++)
    {
        OutgoingPipe[i]=sc.nextInt();
    }
    
    int I_total=0;
    int O_total=0;

    for(int i=0;i<Incpipe_no;i++)
    {
        I_total+=(IncomePipe[i]-rustF);
    }

    for(int i=0;i<Outpipe_no;i++)
    {
        O_total+=(OutgoingPipe[i]-rustF);
    }
   
    if(I_total==O_total)
    {
        System.out.println("BALANCED");
    }
    else if(I_total>O_total)
    {
        int result=(I_total-O_total)+rustF;
        System.out.println("-"+result);
    }
    else
    {
        int result=(O_total-I_total)+rustF;
        System.out.println(+result);
    }
    
  }
}
