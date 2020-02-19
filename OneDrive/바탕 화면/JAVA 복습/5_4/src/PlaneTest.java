
public class PlaneTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane();
		p1.setIdf(1);
		p1.setModel("aa");
		p1.setPassenger(200);
		System.out.println("½Äº°¹øÈ£:"+p1.getIdf()+" ¸ðµ¨:"+p1.getModel()+" ½Â°´¼ö:"+p1.getPassenger());
		
		Plane p2 = new Plane();
		p2.setIdf(2);
		p2.setModel("bb");
		p2.setPassenger(300);
		System.out.println("½Äº°¹øÈ£:"+p2.getIdf()+" ¸ðµ¨:"+p2.getModel()+" ½Â°´¼ö:"+p2.getPassenger());
		
		Plane p3 = new Plane();
		p3.setIdf(3);
		p3.setModel("cc");
		p3.setPassenger(150);
		System.out.println("½Äº°¹øÈ£:"+p3.getIdf()+" ¸ðµ¨:"+p3.getModel()+" ½Â°´¼ö:"+p3.getPassenger());
		
		System.out.println("ÃÑ ºñÇà±â ¼ö:"+Plane.getPlanes());
	}
}
