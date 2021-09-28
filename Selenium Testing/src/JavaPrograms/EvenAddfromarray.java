package JavaPrograms;

public class EvenAddfromarray {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,7,8};
		
		int len = a.length;
		
		System.out.println("Even numbers in Array:........");
		
		for(int i=0; i<=len-1; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]); 
			}
		}	
		
		System.out.println("Odd numbers in Array:........");
		
		for(int i=0; i<=len-1; i++)
		{	
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
			
		}

	}

}
