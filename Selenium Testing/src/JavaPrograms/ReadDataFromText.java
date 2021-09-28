package JavaPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromText {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\Acer\\Downloads\\Test.txt");
		BufferedReader bf = new BufferedReader(fr);
		
		String str;
		
		while((str = bf.readLine()) != null)  // NO DATAS IN FILE MEANS RETURN NULL - SO CHECK WITH NULL
		{
			System.out.println(str);
		}
		
		bf.close();

	}

}
