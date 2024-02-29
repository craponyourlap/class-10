                                                                                            package class10;

import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("enter initial balance");
			double initialBalance = in.nextDouble();
			validateInitialBalance(initialBalance);
			//nested try-catch block
			try {
				System.out.println("enter amount to withdraw");
				double withdrawalAmount = in.nextDouble();
				validateWithdrawalAmount(withdrawalAmount,initialBalance);
				@SuppressWarnings("unused")
				double remainingBalance = updateBalance(initialBalance, withdrawalAmount);
			}catch (InvalidWithdrawalException e) {
				System.out.println("shit hit the fan: "+e.getMessage());
			}catch (Exception e) {
				System.out.println("something wrong happened: "+e.getMessage());
			}finally {
				//this code will always get executed
				System.out.println("rest of the program");
				in.close();
			}
		}catch (InvalidInitialBalanceException e) {
			
		}
	}

	private static void validateInitialBalance(double initialBalance) throws InvalidInitialBalanceException{
		// TODO Auto-generated method stub
		if (initialBalance < 0) {
			throw new InvalidInitialBalanceException("YOU CAN'T SET THE INITIAL BALANCE THIS WAY");
		}
	}

	private static double updateBalance(double initialBalance, double withdrawalAmount) {
		// TODO Auto-generated method stub
		return initialBalance - withdrawalAmount;
	}

	private static void validateWithdrawalAmount(double withdrawalAmount, double initialBalance) throws InvalidWithdrawalException {
		// TODO Auto-generated method stub	
		if (withdrawalAmount < 0 || withdrawalAmount > initialBalance) {
			throw new InvalidWithdrawalException("DO SOMETHING MORE PRODUCTIVE THAN THIS");
		}
	}
	static class InvalidWithdrawalException extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InvalidWithdrawalException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
		
	}
	static class InvalidInitialBalanceException extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InvalidInitialBalanceException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
		
	}
}
