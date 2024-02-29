package class10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class InputStreamExample2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fin1 = new FileInputStream("C:/Users/6177869/Desktop/test1.txt");
		FileInputStream fin2 = new FileInputStream("C:/Users/6177869/Desktop/test2.txt");
		FileOutputStream fout = new FileOutputStream("C:/Users/6177869/Desktop/testout.txt");
		SequenceInputStream sys = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sys.read()) != -1) {
			fout.write(i);
		}
		fin1.close();
		fin2.close();
		fout.close();
		sys.close();
		System.out.println("gg");
	}

}
