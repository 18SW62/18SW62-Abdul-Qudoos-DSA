import java.util.Scanner;
class Area{
	double length;
	double breadth;
	Area(double length,double breadth){//constructor for set length and breadth;
		this.length=length;
		this.breadth=breadth;
	}
	public double returnArea(){//method of return the value of area;
		double area=length*breadth;
		return area;
	}
}
class Task3{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);//Scanner class is used for taking input from the user;
	System.out.println("enter the value of length");
	double length=in.nextDouble();
	System.out.println("enter the value of breadth");
	double breadth=in.nextDouble();	
	Area ar=new Area(length,breadth);
	System.out.println(ar.returnArea());
	}
}