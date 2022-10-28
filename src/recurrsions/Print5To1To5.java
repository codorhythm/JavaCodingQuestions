package recurrsions;

public class Print5To1To5 {

	public void print(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return;
		}
		
		System.out.println(n);
		print(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print5To1To5 obj = new Print5To1To5();
		obj.print(5);
	}

}
