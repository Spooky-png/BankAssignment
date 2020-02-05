import java.util.Random;
public class BankAccount {
	Integer accountnumber;
	private static double checkingbalance = 0;
	private static double savingsbalance = 0;
	private static int numberOfAccounts = 0;
	private static double totalMoney = 0;
	public Integer createAccount() {
		Random r = new Random();
		accountnumber = r.nextInt();
		if(accountnumber < 0) {
			accountnumber = accountnumber*-1;
		}
		accountnumber.toString();
		System.out.println("New Account Number is: " +accountnumber);
		numberOfAccounts++;
		return accountnumber;
	}
	public static int accountCount() {
		return numberOfAccounts;
	}
	public static double moneyCount() {
		totalMoney = checkingbalance + savingsbalance;
		return totalMoney;
	}
	public static double addChecking(double param) {
		checkingbalance = checkingbalance + param;
		return checkingbalance;
	}
	public static double addSavings(double param) {
		savingsbalance = savingsbalance + param;
		return savingsbalance;
	}
	public static double takeSavings(double param) {
		if(param < savingsbalance) {
		savingsbalance = savingsbalance - param;
		return savingsbalance;
		}
		else {
			System.out.println("NAH");
			return savingsbalance;
		}
	}
	public static double takeChecking(double param) {
		if(param < checkingbalance) {
		checkingbalance = checkingbalance - param;
		return checkingbalance;
		}
		else {
			System.out.println("NAH");
			return checkingbalance;
		}
	}
}