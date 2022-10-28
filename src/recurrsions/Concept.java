package recurrsions;

public class Concept {

	public static void fun1(int n)
	{
		if(n == 1)
		{
			System.out.println(n);
			return;
		}
		
		System.out.println(n);
		fun1(--n);
	}
	
	public static void fun2(int n) 
	{
		if(n == 1)
		{
			return;
		}
		
		System.out.println(n);
		fun2(n--);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		fun1(5);
//		fun2(5);
	}

}
