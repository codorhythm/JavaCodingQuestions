package arrays;
/*You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.*/
public class FindUnique {
	
	public static int findUnique(int[] arr)
    {
		for(int i = 0;i < arr.length; i++)
        {
            int j;
            for(j = 0; j<arr.length; j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                        break;
                    }
                }
            }
            if(j==arr.length)
            {
                return arr[i];
            }
        }
        
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 3, 1, 3, 6, 6, 7, 10, 7};
		System.out.println(findUnique(arr));

	}

}
