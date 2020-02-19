
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount myAccount1 = new BankAccount(10000);
		BankAccount myAccount2 = new BankAccount();
		
		System.out.println("transfer("+myAccount1.transfer(1000,myAccount2)+")");
		
		myAccount1.print(1);
		myAccount2.print(2);
	}
}
