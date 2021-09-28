package JavaPrograms;

public class FindMissingNuminArray {

	public static void main(String[] args) {
		
		// CONDITIONS:
		// NUMBER SHOULD NOT BE IN DUPLICATE
		// NUMBERS CAN ASSENDING AND DESENDING ORDER
		// NUMBERS ARE IN RANGE
		
		int a[] = {1,2,3,4,5,6,8};
		
		int sum1 = 0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1 = sum1 + a[i];
		}
		
		System.out.println(sum1);
		
		int sum2 = 0;
		
		for(int i=1; i<=8 ; i++)
		{
			sum2 = sum2 + i;
		}
		
		System.out.println(sum2);
		
		System.out.println("Missing number is:"+(sum2-sum1));
		

	}

}
