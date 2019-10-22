class Example{
	int salary,hours; //declearment of instants varaibles;
	public void getinfo(int salary,int hours){
		this.salary=salary;
		this.hours=hours;
	}
	public void addSal(){//method for increase in salary upto 10 if it is less than 500 dollars;
		if(salary<500){
		salary+=10;
	}
}
	public void addwork(){//method for increase in salary upto 5 if it is greater than 6 hours;
		if(hours>6){
		salary+=5;
		}
	}
	public void printsalary(){//method for print salary
		System.out.println("Salary is="+salary);
	}
}
class Task1{
	public static void main(String[] args) {
		Example ex=new Example();
		ex.getinfo(400,7);
		ex.addSal();
		ex.addwork();
		ex.printsalary();
	}
}