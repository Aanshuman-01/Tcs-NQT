/* Amarasimha wanted to know the final position of a person,who starts from the origin 0 0 and travels per following scheme
   (i)He first turns and travels 10 units of distance
   (ii)His second turn is upward for 20 units
   (iii)Third turn is to the left for 30 units
   (iv)Fourth turn is the downward for 40 units
   (v)Fifth turn is to the right (again)for 50 units

   ....And thus he travels,every time increasing the travel distance by 10 units.
                            /|\
                             |                                                    .Step-7(90,50)
                             |                                                    |
                             |                                                    |
                             |                                                    |
                             |                                                    |
   Step-3(-20,20).-----------|---------.Step-2(10,20)                             |
                 '           |         '                                          |
                 '           |         '                                          |
   /             '           |(0,0)    '                 \                        | 
   \-------------'-----------|---------.-----------------/                        |
                 '           |          Step-1:(10,0)                             | 
                 '           |                                                    |
                 '           |                                                    |
                 '           |                                                    |
                 '.----------|------------------------.---------------------------.Step-6(90,-20)
        Step-4(-20,-20)      |                        Step-5(30,-20)
                             |
                             |
                            \|/

Case 1:Input:3
       Expected Output:-20,20

Case 2:Input:4
       Expected Output:-20,-20
       
Case 3:Input:5
       Expected Output:30,-20

Case 4:Input:6
       Expected Output:90,-20

*/
package TCSNQT;
import java.util.Scanner;
public class nqt_3 
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Input is:");
       int n=sc.nextInt();
       getDistance(n);
   }    

   public static void getDistance(int n)
   {
    char ch='R';
    int x=0;
    int y=0;
    int distance=10;
    while(n>0)
    {
      switch(ch)
      {
        case 'R':
        x=x+distance;
        distance=distance+10;
        ch='U';
        break;

        case 'U':
        y=y+distance;
        distance=distance+10;
        ch='L';
        break;

        case 'L':
        x=x-distance;
        distance=distance+10;
        ch='D';
        break;

        case 'D':
        y=y-distance;
        distance=distance+10;
        ch='A';
        break;

        case 'A':
        x=x+distance;
        distance=distance+10;
        ch='R';
        break;
     }
     n--;
    }
    System.out.println("X Co-ordinate is:"+x);
    System.out.println("Y Co-ordinate is:"+y);
   }
}
