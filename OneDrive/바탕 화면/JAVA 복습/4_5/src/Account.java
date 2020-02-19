
public class Account {
	int balance;
	
	public Account(){
		balance = 0;
		System.out.println("새로운 계좌가 만들어졌습니다.");
	}
	
	public void withdraw(int amount) {
		System.out.println(amount+"원 인출");
		balance -= amount;
	}
	
	public void deposit(int amount) {
		System.out.println(amount+"원 저축");
		balance += amount;
	} 
	
	public void print(int n) {
		System.out.println("고객 #"+n+"계좌 잔고="+balance);
	}
}
