import java.util.*;
public class prjE4
{
	public static void main(String args[])
	{
		int number = 1, x=1;
		int LCD =0;
		boolean result= false, temp = true;
		while(result==false)
		{
			x=1;
			temp=true;
			while(temp == true && x<=20)
			{
				if(number%x!=0)
				{
					temp = false;
				}
				x++;
			}
			number++;
			result=temp;
		}
		System.out.println(number-1);
	}

}