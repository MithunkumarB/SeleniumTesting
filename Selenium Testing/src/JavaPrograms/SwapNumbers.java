package JavaPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 30;
	//	int temp = 0;
		
/*		System.out.println("Befor swaping:" + num1 + " and " + num2);
		
		temp = num1; // temp = 50
		num1 = num2; // num1 = 30
		num2 = temp; // num2 = 50
		
		System.out.println("After swaping:" + num1 + " and " + num2);              */
		
		//WITHOUT USE 3RD VARIABLE
		
		System.out.println("Befor swaping:" + num1 + " and " + num2);
		
		num1 = num1+num2;  //num1 = 50+30=80
		num2 = num1-num2;  //num2 = 80-30 = 50
		num1 = num1-num2;  //num1 = 80-50 = 30
		
		System.out.println("After swaping:" + num1 + " and " + num2); 
	}

}
