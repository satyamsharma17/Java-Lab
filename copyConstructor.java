class Complex {

	private double realNumber, imaginaryNumber;

	// Constructor 1
	// Parameterized constructor
	public Complex(double realNumber, double imaginaryNumber)
	{
		this.realNumber = realNumber;
		this.imaginaryNumber = imaginaryNumber;
	}

	// Constructor 2
	// Copy constructor
	Complex(Complex copyCon)
	{
		System.out.println("Copy constructor called!");

		realNumber = copyCon.realNumber;
		imaginaryNumber = copyCon.imaginaryNumber;
	}

	// Overriding the toString() of Object class
	@Override public String toString()
	{
		return "(" + realNumber + " + " + imaginaryNumber + "i)";
	}
}

public class copyCon {

	public static void main(String[] args)
	{
		// Creating object of above class
		Complex copyCon1 = new Complex(10, 15);

		// Following involves a copy constructor call
		Complex copyCon2 = new Complex(copyCon1);

		// Note: Following doesn't involve a copy
		// constructor call
		// as non-primitive variables are just references.
		Complex copyCon3 = copyCon2;

		// toString() of copyCon2 is called here
		System.out.println(copyCon2);
	}
}
