package tr.org.linux.kamp.account;

public class AccountApplication {

	public static void main(String[] args) {

		Account myAccount = new Account("merve şahin", 500);
		Account myAccount2 = new Account();
		Account myAccount3 = new Account("yavuz çetin", 300);
		
		myAccount3.deposit(3000);

		System.out.println(myAccount.getName());
		System.out.println(myAccount2.getName());
		System.out.println(myAccount3.getBalance());

	}
}
