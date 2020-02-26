package rps;
import java.util.*;

public class rpsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하나를 선택 하세요 : 가위(0), 바위(1), 보(2) : ");
		int n = sc.nextInt();
		
		Me m = new Me(n);
		Pc p = new Pc();
		
		if(m.value == 0) { //가위
			if(p.value == m.value)
				System.out.print("비겼습니다.");
			else if(p.value == 1)
				System.out.print("컴퓨터가 이겼습니다.");
			else
				System.out.print("당신이 이겼습니다.");
		}
		else if(m.value == 1) { //바위
			if(p.value == m.value)
				System.out.print("비겼습니다.");
			else if(p.value == 2)
				System.out.print("컴퓨터가 이겼습니다.");
			else
				System.out.print("당신이 이겼습니다.");
		}
		else if(m.value == 2) { //보
			if(p.value == m.value)
				System.out.print("비겼습니다.");
			else if(p.value == 0)
				System.out.print("컴퓨터가 이겼습니다.");
			else
				System.out.print("당신이 이겼습니다.");
		}
		
		
		
	}

}
