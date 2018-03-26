import java.util.*;

// one class needs to have a main() method
public class ArrayRandom
{
  	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr = arr (10, 10);
      	System.out.println(Arrays.toString(arr));
      	
      	int sLeft = arr[0];
		int sRight = 0;
      for (int i = 2; i < arr.length; i++){
        sRight += arr[i];
      }
           for (int N = 1;sLeft == sRight ^ N+1 < arr.length; N++){
             sLeft += arr[N];
             sRight -= arr[N+1];
             System.out.println(sLeft);
             System.out.println(sRight);
             System.out.println();
           
           }
           
      
		// your code goes here
	}
	static int[] arr(int x, int y){
		int[] arr = new int[x];
      	Random rnd = new Random();
		for (int i = 0; i < arr.length; i++){
			arr[i] = (rnd.nextInt(2*y+1) - y);
          	
		}
		return arr;
      
	}
}
