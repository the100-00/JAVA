import java.util.*;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Array[] list = new Array[10];
		
		for(int i=0; i<10; i++)
			list[i] = new Array(0);

		System.out.println("--------------------");
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		System.out.println("--------------------");
		for(int i=0; i<10; i++)
			System.out.print(list[i].array+" ");
		System.out.print("\n");
		System.out.println("--------------------");
		
		System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?");
		int n = sc.nextInt();
		list[n].reserve();
		System.out.println("����Ǿ����ϴ�.");
		
		System.out.println("--------------------");
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		System.out.println("--------------------");
		for(int i=0; i<10; i++)
			System.out.print(list[i].array+" ");
		System.out.print("\n");
		System.out.println("--------------------");
			}
}

