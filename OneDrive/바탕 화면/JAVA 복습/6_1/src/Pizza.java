
public class Pizza extends Circle{
	
	private String pizza;//private 동일한 클래스에서만 사용가능
	private int radius;
	
	public Pizza(String p , int r) {
		super(r); //명시적인 호출, 부모클래스에 기본 생성자가 없기 때문에 묵시적인 호출 불가능
		pizza = p;
		radius = r;
	}
	
	public void print() {
		System.out.print("피자의 종류:"+pizza+",피자의 크기:"+radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza obj = new Pizza("Pepeeroni", 20);
		
		obj.print();
	}
}	
