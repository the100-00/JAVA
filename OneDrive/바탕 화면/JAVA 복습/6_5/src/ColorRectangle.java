
public class ColorRectangle extends Rectangle{
	String color;
	
	public ColorRectangle(int width, int height, String color) {
		super(width, height);
		this.color = color;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorRectangle obj = new ColorRectangle(100,100,"blue");
		System.out.println("����: "+obj.width);
		System.out.println("����: "+obj.height);
		System.out.println("����: "+obj.color);
	}
}
