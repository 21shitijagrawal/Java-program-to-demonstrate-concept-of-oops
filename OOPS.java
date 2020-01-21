/* See the Description for more infromation. */
import java.util.Scanner;
interface Data{
	void show();
}
class Person implements Data{
	protected String name;
	protected String address;
	protected int age;
	public void set(){
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		this.name = s.next();
		System.out.print("\nEnter Age : ");
		this.age = s.nextInt();
		System.out.print("\nEnter Address : ");
		this.address = s.next();
	}
	public String getName(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}
	public int getAge(){
		return this.age;
	}
	public void set(String name, int age, String address){ // Method overloading.
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void show(){
		System.out.println("Name is : " + this.name);
		System.out.println("Age is : " + this.age);
		System.out.println("Address : " + this.address);
	}
}
class Employee extends Person {
	private int employeeId; 
	private double salary;
	public void set(){ // Runtime Polymorphism :  overwriting method of super class.
		Scanner s = new Scanner(System.in);
		super.set();
		System.out.print("\nEnter the Employee Id : ");
		this.employeeId = s.nextInt();
		System.out.print("\nEnter the Employee Salary : ");
		this.salary = s.nextDouble();
	}
	public int getEmployeeId(){
		return this.employeeId;
	}
	public double getSalary(){
		return this.salary;
	}
	public void show(){
		super.show();
		System.out.println("Employee Id : " + this.employeeId);
		System.out.println("Employee Salary : " + getSalary());
	}
}
class OOPS{
	public static void main(String[] args){

		Person p = new Person();
		p.set("Person", 16, "ABCB CDJ");
		p.show();
		
		Person runTime = new Employee();
		runTime.set();
		runTime.show();
	}
}
