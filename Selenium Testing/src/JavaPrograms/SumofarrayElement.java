package JavaPrograms;

public class SumofarrayElement {

	public static void main(String[] args) {


		int a[] = {2,3,4,5,6,7,8};
		
		int len = a.length;
		
		int sum = 0;
		
	/*	for(int i=0; i<=len-1; i++) // HERE i=0; i<=7-1 = 6; 
		{
			sum = sum + a[i];
		}   */
		
		//Using Enhanced For-loop
		//=========================
		
		for(int values:a) // HERE 'a' VALUES ARE ASSIGNED TO 'values' 
		{
			sum = sum+values;
		}
		
		
		System.out.println("The Sum of Array is:" + sum);

	}

}
