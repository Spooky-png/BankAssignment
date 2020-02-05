
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount();
		a.createAccount();
		b.createAccount();
		a.addChecking(9.3);
		a.addSavings(10.11);
		b.takeChecking(100000.23);
		System.out.println(BankAccount.accountCount());
		System.out.println(a.moneyCount());
	}

}
