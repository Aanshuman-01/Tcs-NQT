/* A person has many shoes of different sizes and he wants to arrange them,Calculate the number of pairs of shoes.
  
   Example 1:
   8
   7L 7R 7L 8L 6R 7R 8R 6R
   Output: 3

   Example 2:
   5
   7R 7L 8R 10R 10L
 
 */


package TCSNQT;
import java.util.*;
public class nqt_25
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();
     HashMap<String,Integer> store=new HashMap<>();
     for(int i=0;i<N;i++)
     {
        String shoeSize=sc.nextLine();
        store.put(shoeSize,store.getOrDefault(shoeSize,0)+1);
     }

     int pairs=0;
     for(HashMap.Entry<String,Integer> entry:store.entrySet())
     { 
        String key=entry.getKey();
        int value=entry.getValue();
        String opposite;
        if(key.charAt(key.length()-1)=='L')
        {
            opposite=key.substring(0,key.length()-1)+'R';
        }
        else
        {
            opposite=key.substring(0,key.length()-1)+'L';
        }
        if(store.containsKey(opposite))
        {
            pairs+=Math.min(value,store.get(opposite));
        }
     }
     System.out.println(pairs/2);
   }  
}
