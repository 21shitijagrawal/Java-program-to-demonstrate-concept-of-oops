/* See the Description for more infromation. */
import java.util.Scanner;
class Person{
	protected String name;
	protected String address;
	protected int age;
	void get(){
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		this.name = s.next();
		System.out.print("\nEnter Age : ");
		this.age = s.nextInt();
		System.out.print("\nEnter Address : ");
		this.address = s.next();
	}
	void get(String name, int  age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void show(){
		System.out.println("Name is : " + this.name);
		System.out.println("Age is : " + this.age);
		System.out.println("Address : " + this.address);
	}
}
class Employee extends Person {
	private int employeeId;
	private double salary;
	void get(){
		Scanner s = new Scanner(System.in);
		super.get();
		System.out.print("\nEnter the Employee Id : ");
		this.employeeId = s.nextInt();
		System.out.print("\nEnter the Employee Salary : ");
		this.salary = s.nextDouble();
	}
	void show(){
		super.show();
		System.out.println("Employee Id : " + this.employeeId);
		System.out.println("Employee Salary : " + this.salary);
	}
}
class OOPS{
	public static void main(String[] args){
		Employee e = new Employee();
		e.get();
		e.show();
	}
}
