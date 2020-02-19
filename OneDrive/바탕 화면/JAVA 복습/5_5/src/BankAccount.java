
public class BankAccount {
	static int n;
	int balance;
	
	public BankAccount(){
		balance = 0;
		n++;
		print(n);
	}
	
	public BankAccount(int balance){
		this.balance = balance;
		n++;
		print(n);
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public void deposit(int amount) {
		balance += amount;
	} 
	
	public int transfer(int amount, BankAccount otherAccount) {
		withdraw(amount);
		otherAccount.deposit(amount);
		return amount;
	}
	
	public void print(int n) {
		System.out.println("myAccount"+n+": 현재 잔액은 "+balance+"입니다.");
	}
}
