import java.util.Random; //here we are importing a package of Random class
class Task1{
	public static void main(String[] args) {
		Random r1=new Random();
		int Array[]=new int[100];
		for(int i=1;i<100;i++){
		Array[i]=r1.nextInt();
		}
	}
}