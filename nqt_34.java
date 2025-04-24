/* A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different groups of patients
   depending on their age. If the patient’s age is below 17, fees is 200 INR. If the patient’s age is between 17 and 40, fees is 400 INR.
   If patient’s age is above 40, fees is 300 INR. Write a code to calculate earnings in a day for which one array/List of values 
   representing age of patients visited on that day is passed as input.
   Note:
       Age should not be zero or less than zero or above 120
       Doctor consults a maximum of 20 patients a day
       Enter age value (press Enter without a value to stop):
   Example 1:
   Input
        20
        30
        40
        50
        2
        3
        14
   Output
     Total Income 2000 INR
   Note: Input and Output Format should be same as given in the above example.
         For any wrong input display INVALID INPUT
   Output Format
   Total Income 2000 INR
 
*/


package TCSNQT;
import java.util.*;
public class nqt_34 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>20)
        {
            System.out.println("Doctor can not see patients more than 20 in number");
            return;
        }
        int arr[]=new int[n];
         for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=17)
            {
              sum+=200;
            }
            else if(arr[i]>17 && arr[i]<=40)
            {
                sum+=400;
            }
            else if(arr[i]>40)
            {
                sum+=300;
            }
        }
        System.out.println("Total income is:"+sum);
    }
}
