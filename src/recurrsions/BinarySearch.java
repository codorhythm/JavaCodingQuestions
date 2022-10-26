package recurrsions;

public class BinarySearch {

	public static int BinarySearch(int arr[], int n, int start, int end)
	{
		if(start> end)
		{
			return -1;
		}
		
		int mid  = (start + end) / 2;
		if(arr[mid] == n)
		{
			return mid;
		}
		
		if(n > mid)
		{
			return BinarySearch(arr, n, mid+1, end);
		}
		else
		{
			return BinarySearch(arr, n, start, mid-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,71};
		System.out.println(BinarySearch(arr, 6, 0, arr.length-1));

	}

}
