/* 2. Given an array and an integer k,find the maximum for each and every contiguous subarray of size k.
      Example 1: Input: arr[]={1,2,3,1,4,5} ,k=3
                 Output:3 3 4 5
                 Explanation:Maximum of 1,2,3 is 3
                             Maximum of 2,3,1 is 3
                             Maximum of 3,1,4 is 4
                             Maximum of 1,4,5 is 5

      Example 2: Input: arr[]={8,5,10,7,9,4,15,12,90,13},k=4
                 Output: 10 10 10 15 15 90 90
                 Explanation:Maximum of first 4 elements is 10,similarly for next 4 elements(i.e.from index 1 to 4)is 10.so,the sequence 
                 generated is 10 10 15 15 90 90

      Example 3: Input: arr[]={20,10,30},k=1
                 Output:20 10 30
 */

package TCSNQT;
import java.util.Scanner;
import java.util.ArrayList; 
public class nqt_2
{
        public static ArrayList func(int n,int k,int arr[]){
            ArrayList list = new ArrayList<>();
            int max=0;
            for(int i=0;i<k;i++){
                max=Math.max(arr[i],max);
            }
            list.add(max);
            for(int j=k;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                    list.add(arr[j]);
                }
                else{
                    list.add(max);
                }
            }
            return list;
        }
        public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();//Enter Size of the array
            int k =sc.nextInt();//Enter Subarray size
            int arr[]=new int [n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(func(n,k,arr));
        }  
}
