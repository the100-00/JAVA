
public class Bird implements Animal{
	
	public void walk() {
		System.out.println("���� �� ����");
	}
	
	public void fly() {
		System.out.println("���� �� ����");
	}
	
	public void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal bird = new Bird();
		
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
