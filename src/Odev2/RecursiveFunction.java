package Odev2;

public class RecursiveFunction {

	static int f(int x)
	{
		int toplam = 0;
		for (int i = 0; i <x; i++) 
		{
			toplam +=i;
		}
		return toplam;		
	}
	static int r(int x)
	{
		if (x==1)
			return 1;
		else
			return x+r(x-1);
	}
	public static void main(String[] args) {
		
		System.out.println(f(10));
		System.out.println(r(9));

}
}
