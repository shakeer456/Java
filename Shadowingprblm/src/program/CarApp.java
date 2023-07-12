package program;
import java.util.Scanner;
public class CarApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter car year :");
	int year = scan.nextInt();
	System.out.println("Enter car make :");
	scan.nextLine();
	String make  = scan.nextLine();
	System.out.println("Enter car model :");
	String model = scan.nextLine();
	System.out.println("Enter car color :");
	String color = scan.nextLine();
	System.out.println("Enter car price :");
	double price = scan.nextDouble();
	System.out.println("Enter car number of doors :");
	int NumberOfDoors = scan.nextInt();
	System.out.println("Is the car convertible :");
	boolean isConvertible = scan.nextBoolean();
	System.out.println("Enter number of seats in the car :");
	int NumberOfSeats = scan.nextInt();
	System.out.println("Enter car's fuel type :");
	scan.nextLine();
	String FuelType = scan.nextLine();
	System.out.println("Is the car is four Wheeler :");
	boolean isFourWheeler = scan.nextBoolean();
	
	Car c = new Car(year,make,model,color,price,NumberOfDoors,isConvertible,NumberOfSeats,FuelType,isFourWheeler);
	System.out.println(c.year+" "+c.make+" "+c.model+" "+c.color+" "+c.price+" "+c.NumberOfDoors+" "+c.isConvertible+" "+c.NumberOfSeats+" "+c.FuelType+" "+c.isFourWheeler);
	System.out.println();
	c.startEngine();
	c.stopEngine();
}
}
