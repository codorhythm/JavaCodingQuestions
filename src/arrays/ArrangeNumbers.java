package arrays;
/* You have been given an empty array(ARR) and its size N. 
 * The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2. */
import java.util.*;
public class ArrangeNumbers {

	public static void ArrangeNums(int arr[], int n)
	{
		
		int num = 1;
		int i = 0, j = arr.length-1;
		while(i <= j)
		{
			if(num%2 != 0)
			{
				arr[i] = num;
				if(num > n)
				{
					break;
				}
				i++;
			}
			else
			{
				arr[j] = num;
				j--;
			}
			
			num++;
				
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		ArrangeNums(arr, n);
		
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}

}
