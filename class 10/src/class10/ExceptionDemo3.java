package class10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			processfile("123456789012345678901ijhj");
		}catch (FileNotFoundException e) {
			System.out.println("shit hit the fan: "+e.getMessage());
		}catch (IOException e) {
			System.out.println("another shit hit the fan: "+e.getMessage());
		}catch (IllegalArgumentException e) {
			System.out.println("another shit hit the fan: "+e.getMessage());
		}
		System.out.println("rest of the owl");
	}
	private static void processfile(String filename) throws FileNotFoundException, IOException, IllegalArgumentException{
		//you can throw multiple exceptions
		//throw new UnsupportedOperationException("YOU CAN'T USE THIS YET IT DOESNT WORK");
		if (filename == null|| filename.isEmpty()) {
			throw new FileNotFoundException("INVALID INPUT RETARD");
		}
		//simulate IOException during the file processing after opening the file
		if (filename.equals("example.txt")) {
			throw new IOException("YOU CAN'T USE THIS FILE NAME");
		}
		//simulate another point of throwing a different exception
		if (filename.length() > 20) {
			throw new IllegalArgumentException("IT'S TOO LONG TO BE USED");
		}
		System.out.println("processing file: "+filename);
	}
}
