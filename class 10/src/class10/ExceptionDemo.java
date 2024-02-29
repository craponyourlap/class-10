package class10;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = divide(10, 0);
			System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("shit hit the fan: "+e.getMessage());
		}
		System.out.println("rest of the code");
	}
	static int divide(int i, int j) {
		if (j == 0) {
			throw new ArithmeticException("YOU CAN'T DIVIDE BY ZERO STUPID");
		}
		return i/j;
	}

}
