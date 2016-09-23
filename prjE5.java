import java.util.*;
public class prjE5
{
	public static void main(String args[])
	{
		int result = 0, sum1=0, sum2=0;
		for(int x =1; x<=100; x++)
		{
			sum1+=x*x;
			sum2+=x;
		}
		sum2=sum2*sum2;
		System.out.println(sum2-sum1);
	}
}