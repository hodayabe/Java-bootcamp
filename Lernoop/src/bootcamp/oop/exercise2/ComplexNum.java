package bootcamp.oop.exercise2;

public class ComplexNum implements Complexable{
	
	//fields
	protected double real;
	protected double imag;
	
	
	//Constructor
	public ComplexNum() {
		this.real=0;
		this.imag=0;
	}
	
	public ComplexNum(double real,double imag) {
		this.real=real;
		this.imag=imag;
	}
	
	
	//method
	
	public void add(ComplexNum z) {
		this.real+=z.real;
		this.imag+= z.imag;
	}
	

	public void subtract(ComplexNum z) {
		this.real-=z.real;
		this.imag-= z.imag;
	}
	
	
	public void multiply(ComplexNum z) {
		this.real=(this.real*z.real)-(this.imag*z.imag);
		this.imag= (this.real*z.imag) + (this.imag* z.real);
	}
	
	
	public void divide(ComplexNum z) {
		ComplexNum temp=z.conjugate();
		ComplexNum numerator=new ComplexNum();
		numerator.real=(this.real*temp.real)-(this.imag*temp.imag);
		numerator.imag=(this.real*temp.imag) + (this.imag* temp.real);
		double denominator=(z.real*z.real)+(z.imag*z.imag);
		
		this.real=numerator.real/denominator;
		this.imag=numerator.imag/denominator;
	}
	
	
	public ComplexNum conjugate() {
		return new ComplexNum(this.real,-this.imag);
		
	}
	
	public static ComplexNum add(ComplexNum z1, ComplexNum z2) {
		ComplexNum temp=new ComplexNum(z1.real,z1.imag);
		temp.add(z2);
		return temp;
	}
	
	
	public static ComplexNum subtract(ComplexNum z1, ComplexNum z2) {
		ComplexNum temp=new ComplexNum(z1.real,z1.imag);
		temp.subtract(z2);
		return temp;
	}

	
	public static ComplexNum multiply(ComplexNum z1, ComplexNum z2) {
		ComplexNum temp=new ComplexNum(z1.real,z1.imag);
		temp.multiply(z2);
		return temp;
	}


	public static ComplexNum divide(ComplexNum z1, ComplexNum z2) {
		ComplexNum temp=new ComplexNum(z1.real,z1.imag);
		temp.divide(z2);
		return temp;
	}

	
	public static ComplexNum parseComplex(String s) {
		ComplexNum temp=new ComplexNum();
		return temp;
	}

	@Override
	public double mag() {
		ComplexNum newSquare = this.square();
		return Math.sqrt(newSquare.real + newSquare.imag);
	}

	
	@Override
	public ComplexNum square() {
		return null;
	}

	private int arg() {
		ComplexNum newSquare = this.square();
		return (int) Math.sqrt(newSquare.real + newSquare.imag);
	}

	@Override
	public ComplexNum pow(ComplexNum z, int power) {
		
		return null;
	}

	@Override
	public ComplexNum inverse() {
		// TODO Auto-generated method stub
		return null;
	}


}
