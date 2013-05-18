

public class DP210HW2
{
	public static void main(String[]args)
	{
		System.out.println("Question 1");
		int y=0;
		for (int x=1; x<101; x++)
		{
			y=y+x;
		}
		System.out.println(y);
		System.out.println();
		System.out.println("Question 2");
		double a=1;
		double b=2;
		double c=1;
		
		double pAnswer=(-b+Math.sqrt(Math.pow(b,2)-4*a*c)/(2*a));
		double mAnswer=(-b-Math.sqrt(Math.pow(b,2)-4*a*c)/(2*a));
		System.out.println("The answers are: "+pAnswer+" and "+mAnswer+".");
		System.out.println();
		System.out.println("Question 3");
		int m=1;
		int n=1;
		for (int x=0; x<6; x++)
		{
			System.out.print(m+" ");
			System.out.print(n+" ");
			m=m+n;
			n=m+n;
		}
		System.out.println("\n");
		System.out.println("Question 4");
		for (int i=1; i<6; i++)
		{
			for (int j=i; j<5; j++)
			{
				System.out.print(" ");
			}
			for (int k=i; k>0; k--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Question 5");
		for (int e=0; e<3; e++)
		{
			for (int f=0; f<10; f++)
			{
				for (int g=0; g<3; g++)
				{
					System.out.print(f);
				}
			}
			System.out.println();
		}
	}
}