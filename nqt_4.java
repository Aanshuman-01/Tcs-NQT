/* A supermarket maintains a pricing format for all its products.A value N is printed on each product.
   when the scanner reads the value N on the item,the product of all the digits in the value N is the price of the item.
   The task here is to design the software such that given the code of any item N the product(multiplication) of all the 
   digits of value should be computed(price).
   Input:5244
   Output:160

   Explanation
   From the input above
   Product of the digits 5,2,4,4
   5*2*4*4=160
   Hence,output is 160
 
*/
package TCSNQT;
import java.util.Scanner;
public class nqt_4
{ 
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("The Inputted number is:");
      int N=sc.nextInt();
      int price=1;
      while(N>0)             //"5 2 4 4" ->'5','2','4','4'   ASCII('5')-ASCII('0')=5
      {
        int digit=N%10;
        price=price*digit;
        N=N/10;
      }
      System.out.println("The computed price is:"+price);
    }
    
}
