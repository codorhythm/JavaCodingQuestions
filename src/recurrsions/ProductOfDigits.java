package recurrsions;

public class ProductOfDigits {

	public static int productOfDigits(int n)
	{
		if(n%10 == n || n == 0)
		{
			return 1;
		}
		
		return productOfDigits(n/10) * n%10;
	}
	
	public static void main(String[] args) {
		
		System.out.println(productOfDigits(1023));
		
	}

}
