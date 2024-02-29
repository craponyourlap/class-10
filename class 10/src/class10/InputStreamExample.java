package class10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class InputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input1 = new FileInputStream("C:/Users/6177869/Desktop/read.txt");
		FileInputStream input2 = new FileInputStream("C:/Users/6177869/Desktop/write.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char)j);
		}
		input1.close();
		input2.close();
		inst.close();
	}

}
