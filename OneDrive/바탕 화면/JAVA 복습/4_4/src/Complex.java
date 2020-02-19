
public class Complex {
	int real;
	int imag;
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public void print() {
		System.out.print(real+"+"+imag+"i");
	}
}
