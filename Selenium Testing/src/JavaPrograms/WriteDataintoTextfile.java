package JavaPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoTextfile {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("C:\\Users\\Acer\\Downloads\\Text2.txt");
		BufferedWriter br = new BufferedWriter(fw);
		
		br.write("\n Java Program");
		br.write("\n Python Program");
		br.write("\n Php Program");

		System.out.println("Finished");
		br.close();
	}

}
