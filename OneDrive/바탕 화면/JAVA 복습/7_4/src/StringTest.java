import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��Ͻÿ�:");
		String s = sc.nextLine();
		
		String[] tokens = s.split(" ");
		for(String t : tokens) 
			System.out.print(t+",");
		System.out.print("\n��� "+tokens.length+"���� �ܾ �ֽ��ϴ�.");
	}
}
