package JavaPrograms;

public class CountNumberofEvenandOdd {

	public static void main(String[] args) {
		
		int num = 123457;
		
		int Odd_count = 0;
		int Even_count = 0;
		
		while(num>0)
		{
			int rem = num%10; // 7 5 4 3 2 1
			num = num/10;
			
			if(rem%2==0) 
			{
				Even_count++; // 4 2
			}
			else
			{
				Odd_count++; // 7 5 3 1
			}
			
			
		}
		
		System.out.println("The Even Count is:" + Even_count);
		System.out.println("The Odd Count is:" + Odd_count);

	}

}
