import java.util.*;
public class prjE3
{
	public static void main(String args[])
	{
		int product = 0;
		String test_palindrome = new String();
		String palindrome = new String();
		for(int digit_one=1; digit_one<1000; digit_one++)
		{
			for(int digit_two=1; digit_two<1000; digit_two++)
			{
				product = digit_one*digit_two;
				test_palindrome = Integer.toString(product);
				if(check_palindrome(test_palindrome)==true)
				{
					palindrome=test_palindrome;
				}
			}
		}
		System.out.println(palindrome);
	}

	public static boolean check_palindrome(String num)
	{
		int x = 0, y = num.length()-1;
		boolean result = true;
		while(x<=y && result == true)
		{
			if(num.charAt(x) != num.charAt(y))
			{
				result = false;
			}
			x++;
			y--;
		}
		return result;
	}
}