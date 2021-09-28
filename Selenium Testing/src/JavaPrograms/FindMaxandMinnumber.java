package JavaPrograms;

public class FindMaxandMinnumber {

	public static void main(String[] args) {
	
		int a[] = {30,40,50,70,80,100};
		
		int max = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			
		}
		
		System.out.println("The Maximum number is : " + max);
		
		int min = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
			
		}
			
		System.out.println("The Minimum number is : " + min);
		
	}

}
