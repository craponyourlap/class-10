package class10;

import java.io.FileInputStream;

public class DataStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:/Users/6177869/Downloads/blank.txt");
			//int i = fin.read(); -> only reads one byte of the txt -> one letter
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char)i);
			}
			fin.close();
		}catch(Exception e) {
			System.out.println("something really bad happened: "+e.getMessage());
		}
	}

}
