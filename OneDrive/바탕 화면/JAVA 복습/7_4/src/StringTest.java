import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시요:");
		String s = sc.nextLine();
		
		String[] tokens = s.split(" ");
		for(String t : tokens) 
			System.out.print(t+",");
		System.out.print("\n모두 "+tokens.length+"개의 단어가 있습니다.");
	}
}
