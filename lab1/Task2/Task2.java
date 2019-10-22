import java.util.Scanner;
class Area{
	double length;
	double breadth;//Declearment of instants Variables
	
	public void setDim(double length,double breadth){//method for set dimension of length and breadth;
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea(){//method for return the value of area 
	double area=length*breadth;
	return area;
	}
}
class Task2{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in); //Scanner class is used for taking input from the user;
		System.out.println("enter the value of length");
		double length=in.nextDouble();
		System.out.println("enter the value of breadth");
		double breadth=in.nextDouble();
		Area ar=new Area();
		ar.setDim(length,breadth);
		System.out.println(ar.getArea());
		}
}