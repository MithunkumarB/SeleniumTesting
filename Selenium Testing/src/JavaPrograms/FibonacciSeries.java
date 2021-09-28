package JavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1=0; 
		int num2=1;
		int sum = 0;
		
		System.out.print(num1 +" "+num2);
		
		for(int i=2; i<10; i++)
		{
			sum = num1+num2;
			System.out.print(" "+sum);
			num1 = num2;  // num1 = 1.....
			num2 = sum; // num2 = 1.....
		}
		

	}

}
