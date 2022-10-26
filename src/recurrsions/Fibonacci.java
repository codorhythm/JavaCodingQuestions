package recurrsions;
/*Find the nth fibonacci number using recurrsion */
import java.util.*;
public class Fibonacci {

	public static int Fibonacci(int n)
	{
		if(n == 1 || n==0)
		{
			return n;
		}
		
		int sum  = Fibonacci(n-1) + Fibonacci(n-2);
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Fibonacci(n));

	}

}
