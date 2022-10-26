package arrays;

public class BinarySearch {

	public static int BinarySearch(int arr[], int n )
	{
		int start = 0; int end = arr.length-1;
		while(start <= end)
		{
			int mid = (start+end)/2;
			if(arr[mid] == n)
			{
				return mid;
			}
			else if(n>arr[mid])
			{
				start = mid+1;
			}
			else
			{
				end = mid -1; 
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,5,6,7,8};
		System.out.println(BinarySearch(arr, 3));
		

	}

}
