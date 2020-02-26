
public class Bird extends Animal{
	
	public void fly() {
		System.out.println("날을 수 있음");
	}
	
	public void sing() {
		System.out.println("노래 부를 수 있음");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
