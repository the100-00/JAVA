import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		for(int i=0; i<score.length; i++) {
			System.out.print("������ �Է��ϼ���:");
			score[i] = sc.nextInt();
		}
		System.out.print("\n");
		calc(score);
	}
	
	public static void calc(int[] score) {
		double avarage = 0;
		int sum = 0;
		
		for(int i=0; i<score.length; i++) 
			sum += score[i];
		
		avarage = (sum/5); 
		System.out.println("�հ� : " + sum);
		System.out.println("��� : "+avarage);
	}
}
