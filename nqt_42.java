/* For hirirng a car,a travel agency charges R1 rupees per hour for the first N hours and then R2 rupees per hour.
   Given the total time of travel in minutes in X.

   The task is to find the total travelling cost in rupees.
   Note:While converting minutes into hours,ceiling value should be considered as the total number of hours.
   For Example:if the total travelling time is 90 minutes i.e 1.5 hours,it ,must be considered as 2 hours.
   
   Example:
   Input:
   20-->r1
   4-->n
   40-->r2
   300-->x

   Output:
   120

   Explanation:
   Total travelling hours=300/60=5 hours
   Rupess 20/hours for first 4 hours=20*4=80 hours
   Rupees 40/hours in 5th hour=40*1=40 rupees
   Hence,the total travelling cost=80+40=120 rupees

    Test code 1:
    Input:
    30
    5
    35
    500
    Output:290
    
    Test case 2:
    Input:
    30
    10
    35
    5
    Ouput:30
 
 */

package TCSNQT;
import java.util.*;
public class nqt_42 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int n=sc.nextInt();
        int r2=sc.nextInt();
        int total_time=sc.nextInt();
        int total_cost=0;

        int total_hours=(int)Math.ceil(total_time/60.0);
        if(total_hours<=n)
        {
            total_cost=total_hours*r1;
        }
        else if(total_hours>n)
        {
            total_cost=(r1*n)+((total_hours-n)*r2);
        } 
        System.out.println(total_cost);
    }
}
