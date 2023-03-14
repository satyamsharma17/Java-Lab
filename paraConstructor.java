import java.io.*;
class paraConstructor {

	String name;
	int id;

	paraConstructor(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
	// This would invoke the parameterized constructor.
	paraConstructor studentOne = new paraConstructor("Satyam", 48);
	System.out.println("Student Name: " + studentOne.name + " and Student Id: " + studentOne.id);
	
	}
}