package rps;

public class Pc {
	int value;
	Pc(){
		value = (int)(Math.random()*3);
		System.out.print("��ǻ�ʹ� ");
		switch(value) {
		case 0:
			System.out.println("������ �½��ϴ�."); break;
		case 1:
			System.out.println("������ �½��ϴ�."); break;
		case 2:
			System.out.println("���� �½��ϴ�."); break;
		}
	}
}
