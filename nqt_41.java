/* Given array of N integers,task is to replace elements with its rank in the array.
   Example 1:
   Input: 20 15 26 2 98 6
   Output:4  3  5  1 6  2
   Explanation:When sorted the array is 2,6,15,20,26,98.So the rank of 2 is 1,rank of 6 is 2,
               rank of 15 is 3 and so...

    Example 2:
    Input: 1 5 8 15 8 25 9
    Output:1 2 3 5  3 6  4
    Explanation:When sorted,the array is 1,5,8,8,9,15,25.So the rank of 1 is 1,rank of 5 is 2,
    rank of 8 is 3 and so...
  
 */


package TCSNQT;
import java.util.*;
public class nqt_41 
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int arr1[]=new int[n];
    for(int j=0;j<n;j++)
    {
        arr1[j]=arr[j];
    }
    Arrays.sort(arr1);
    HashMap<Integer,Integer> hm=new HashMap<>(); 
    for(int i=0;i<arr.length;i++)
    {
        hm.put(arr1[i],i);
    }
    ArrayList<Integer> list=new ArrayList<>();
    for(int num:arr)
    {
      list.add(hm.get(num));
    }
    for(int num1:list)
    {
        System.out.print(num1+" ");
    }
   }    
}
