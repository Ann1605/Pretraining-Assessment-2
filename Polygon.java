import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of sides on the polygon:");
		int n=sc.nextInt();
		
		System.out.print("Enter length of one of the sides:");
		int s = sc.nextInt();
		
		double div = 180/(double)n;
		double tan = Math.tan(div);
		double sPower = Math.pow(s,2);
		double res = (n*sPower)/(4*tan);
		
		System.out.println(res);
	}
}
