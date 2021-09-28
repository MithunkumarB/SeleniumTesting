package JavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckArrayEqualorNot {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		int b[] = {1,2,3,4,50,6};
		
/*		boolean status = Arrays.equals(a, b);
		
		if(status == true)
		{
			System.out.println("The arrays are equal");
		}
		else
		{
			System.out.println("The arrays are NOT equal");
		}                                                               */
		
//APPROACH-II (WITHOUT USING EQUALS METHOD)
		
		boolean status1 = true;
		
		if(a.length==b.length)
		{
			for(int i=0; i<=a.length-1;i++)
			{
				if(a[i] != b[i])
				{
					status1=false;
				}
			}
		}
		else
		{
			status1=false;
		}
		
		if(status1 == true)
		{
			System.out.println("The arrays are equal");
		}
		else
		{
			System.out.println("The arrays are NOT equal");
		}

	}

}
