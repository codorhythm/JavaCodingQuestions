package recurrsions;

public class SumOfDigits {
	
	public static int SumOfDigits(int n)
	{
		if(n == 0)
		{
			return n;
		}
		
		int x =  SumOfDigits(n/10);
		return x + n%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumOfDigits(12345));
	}

}
