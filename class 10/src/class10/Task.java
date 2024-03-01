package class10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task {
//	Task:
//		IIRC, the task was to WAP that reads the contents of a txt file, then writes it in another txt file
//		excluding 'a' and 'A'.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		FileInputStream in = new FileInputStream(projectPath + "/src/resources/taskIn.txt");
		FileOutputStream out = new FileOutputStream(projectPath + "/src/resources/taskOut.txt");
		int a;
		while ((a = in.read()) != -1) {
			if (a != 'a' && a != 'A') {
				out.write(a);
			}
		}
		in.close();
		out.close();
	}

}
