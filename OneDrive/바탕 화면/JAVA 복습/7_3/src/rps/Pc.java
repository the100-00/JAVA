package rps;

public class Pc {
	int value;
	Pc(){
		value = (int)(Math.random()*3);
		System.out.print("컴퓨터는 ");
		switch(value) {
		case 0:
			System.out.println("가위를 냈습니다."); break;
		case 1:
			System.out.println("바위를 냈습니다."); break;
		case 2:
			System.out.println("보를 냈습니다."); break;
		}
	}
}
