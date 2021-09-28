package JavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortArrayusingBuitinMethod {

	public static void main(String[] args) {
		
		//Approach-1
	/*	int a[] = {30,40,20,80,60,90,50};
		System.out.println("Before Sorting:"+ Arrays.toString(a)); // NEED TO CONVERT ARRAY TO STRING
		Arrays.parallelSort(a);
		System.out.println("After Sorting:"+ Arrays.toString(a));  */
		
		
		//Approach-2
	/*	int a[] = {30,40,20,80,60,90,50};
		System.out.println("Before Sorting:"+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting:"+ Arrays.toString(a));  */
		
		//Approach-3[Descending order]
		Integer a[] = {30,40,20,80,60,90,50};         // HERE COLLECTIONS.REVERSEORDER IS NOT SUPPORTED PRIMITIVE DATATYPE ONLY SUPPORT WRAPPERCLASS
		System.out.println("Before Sorting:"+ Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After Sorting:"+ Arrays.toString(a));
		

	}

}
