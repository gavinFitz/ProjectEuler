import java.util.*;
public class prjE2
{
	public static void main(String args[])
	{
		long num = 600851475143;
		int max = 0;
		for(int i = 0; i <= num; i++)
		{
			if(isPrime(i)==true && num % i==0)
			{
				max = i;
			}
		}
		System.out.println(max);
	}
	public static boolean isPrime(int n)
		{
   			 for(int i = 2; i < (n/2); ++i)
   			 	{
        			if (n % i == 0)
        			{
            			return false;
        			}
   	   		    }
   			 return true;
		}
}