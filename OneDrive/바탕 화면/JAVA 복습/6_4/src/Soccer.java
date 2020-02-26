
public class Soccer extends Sports{
	String getName() {	return "축구";	}
	int getPlayers() {	return 11;	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soccer obj = new Soccer();
		
		System.out.println("경기이름:"+obj.getName());
		System.out.println("경기자수:"+obj.getPlayers());
	}
}
