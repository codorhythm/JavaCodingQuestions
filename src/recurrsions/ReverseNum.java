package recurrsions;

public class ReverseNum {

	public static int reverseNum(int n)
	{
		
		if(n<=0)
		{
			return 0;
		}
		
		int c = 1;
		int newNum = n;
		while(newNum%10 != newNum)
		{
			newNum/=10;
			c*=10;
		}
		
		int x = n%10;
		return (x*c) + reverseNum(n/10);
		
	}
	
	public static void main(String[] args) 
	{
		int n = 12345;
		System.out.println(reverseNum(n));
	}

}
