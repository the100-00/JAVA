
public class Pizza extends Circle{
	
	private String pizza;//private ������ Ŭ���������� ��밡��
	private int radius;
	
	public Pizza(String p , int r) {
		super(r); //������� ȣ��, �θ�Ŭ������ �⺻ �����ڰ� ���� ������ �������� ȣ�� �Ұ���
		pizza = p;
		radius = r;
	}
	
	public void print() {
		System.out.print("������ ����:"+pizza+",������ ũ��:"+radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza obj = new Pizza("Pepeeroni", 20);
		
		obj.print();
	}
}	
