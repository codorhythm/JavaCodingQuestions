package arrays;

public class LinearSearch {

	public static int LinearSearch(int arr[], int num)
	{
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i] == num)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,4,5,6,4};
		System.out.println(LinearSearch(arr, 3));
	}

}
