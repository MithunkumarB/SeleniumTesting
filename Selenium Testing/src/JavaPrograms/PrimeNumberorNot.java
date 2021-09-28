package JavaPrograms;

public class PrimeNumberorNot {

	public static void main(String[] args) {
		
		// NUMBER SHOULD BE NUM>1
		// NUM DIVIDE 2 AND ITSELF
		
		int num = 11;
		int count = 0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
					count++;
			}
			
			if(count == 2)  // ONLY 2 POSSIBLE DIVIDE BY 1 AND 2
			{
				System.out.println("The number is Primenumber");
			}
			else
			{
				System.out.println("The number is Not Primenumber");
			}
		}
		
		else
		{
			System.out.println("The number is Not Primenumber");
		}

	}

}
