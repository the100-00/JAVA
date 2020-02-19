
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("york",1,"orange");
		
		System.out.println("("+dog.breed+","+dog.age+","+dog.color+")");
		dog.barking();
		dog.hungry();
		dog.sleeping();
	}
}
