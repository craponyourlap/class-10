package class10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream("C:/Users/6177869/Desktop/read.txt");
			fout = new FileOutputStream("C:/Users/6177869/Desktop/write.txt");
			//byte[] b = fin.readAllBytes(); -> this is much simplier to use
			int a;
			while ((a = fin.read()) != -1) {
				fout.write(a);
			}
		}catch(Exception e) {
			System.out.println("something went wrong");
		}finally {
			if (fin != null) {
				fin.close();
			}
			if (fout != null) {
				fout.close();
			}
		}
	}

}
