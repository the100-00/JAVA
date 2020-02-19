
public class Dog {
	String breed;
	int age;
	String color;
	
	Dog(String breed, int age, String color){
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	public void barking() {
		System.out.println("barking()");
	}
	
	public void sleeping() {
		System.out.println("sleeping()");
	}
	
	public void hungry() {
		System.out.println("hungry()");
	}
}
