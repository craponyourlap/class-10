package class10;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:/Users/6177869/Downloads/blank.txt");
			String shit = "im programming ur mom";
			byte b[] = shit.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("suckess...");
		}catch(Exception e) {
			System.out.println("some shit went wrong");
		}
	}

}
