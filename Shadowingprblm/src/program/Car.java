package program;

public class Car {
int year;
String make;
String model;
String color;
double price;
int NumberOfDoors;
boolean isConvertible;
int NumberOfSeats;
String FuelType;
boolean isFourWheeler;
public Car(int year,String make,String model,String color,double price,int NumberOfDoors,boolean isConvertible,int NumberOfSeats,String FuelType,boolean isFourWheeler) {
this.year = year;
this.make = make;
this.model = model;
this.color=color;
this.price = price;
this.NumberOfDoors = NumberOfDoors;
this.isConvertible = isConvertible;
this.NumberOfSeats = NumberOfSeats;
this.FuelType = FuelType;
this.isFourWheeler = isFourWheeler;
}
void startEngine() {
	System.out.println(make+" "+model+"Engine is started");
}
void stopEngine() {
	System.out.println(make+" "+model+"Engine is stopped");
}
}
