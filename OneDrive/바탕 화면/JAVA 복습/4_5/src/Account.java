
public class Account {
	int balance;
	
	public Account(){
		balance = 0;
		System.out.println("���ο� ���°� ����������ϴ�.");
	}
	
	public void withdraw(int amount) {
		System.out.println(amount+"�� ����");
		balance -= amount;
	}
	
	public void deposit(int amount) {
		System.out.println(amount+"�� ����");
		balance += amount;
	} 
	
	public void print(int n) {
		System.out.println("�� #"+n+"���� �ܰ�="+balance);
	}
}
