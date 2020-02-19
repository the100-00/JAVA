
public class Plane {
	public static int planes = 0;
	private int idf;
	private String model;
	private int passenger;
	
	public Plane() {
		planes++;
	}
	
	public Plane(int idf, String model, int passenger) {
		this.idf = idf;
		this.model = model;
		this.passenger = passenger;
		planes++;
	}
	
	public int getIdf() {
		return idf;
	}
	
	public void setIdf(int idf) {
		this.idf = idf;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getPassenger() {
		return passenger;
	}
	
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	
	public static int getPlanes() {
		return planes;
	}
}
