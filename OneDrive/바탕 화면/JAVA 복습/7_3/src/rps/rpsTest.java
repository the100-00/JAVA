package rps;
import java.util.*;

public class rpsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ϳ��� ���� �ϼ��� : ����(0), ����(1), ��(2) : ");
		int n = sc.nextInt();
		
		Me m = new Me(n);
		Pc p = new Pc();
		
		if(m.value == 0) { //����
			if(p.value == m.value)
				System.out.print("�����ϴ�.");
			else if(p.value == 1)
				System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
			else
				System.out.print("����� �̰���ϴ�.");
		}
		else if(m.value == 1) { //����
			if(p.value == m.value)
				System.out.print("�����ϴ�.");
			else if(p.value == 2)
				System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
			else
				System.out.print("����� �̰���ϴ�.");
		}
		else if(m.value == 2) { //��
			if(p.value == m.value)
				System.out.print("�����ϴ�.");
			else if(p.value == 0)
				System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
			else
				System.out.print("����� �̰���ϴ�.");
		}
		
		
		
	}

}
