
public class Bird extends Animal{
	
	public void fly() {
		System.out.println("���� �� ����");
	}
	
	public void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
