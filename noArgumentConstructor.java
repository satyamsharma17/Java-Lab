import java.io.*;

class noArgumentConstructor {

	int num;
	String name;

	//int num = 1;
	//String name = "Satyam";

	noArgumentConstructor() { 
	    System.out.println("No Argument Constructor called!");
	}
	
	public static void main(String[] args)
	{
		noArgumentConstructor studentOne = new noArgumentConstructor();

		System.out.println(studentOne.name);
		System.out.println(studentOne.num);
	}
}