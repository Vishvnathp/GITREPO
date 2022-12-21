package Aggregation;

import Aggregation.Address;
import Aggregation.Emp;

class Address {
	String city, state, con;

	public Address(String city, String state, String con) {
		this.city = city;
		this.state = state;
		this.con = con;

	}

}

class Emp extends Address {

	String name;

	public Emp(String city, String state, String con, String name)

	{
		
		
		
		
		
		
		super(city, state, con);
		this.name = name;

	}
	
	
	public void  hello()
	{
		System.out.println("hello");
	}
	
	
	

	public void dis() {
		System.out.println(name);
		System.out.println(city + " " + state + " " + con);
	}
}

public class Student {
	public static void main(String args[]) {
		Emp add = new Emp("kanpur", "up", "india", "Anuj");
		add.dis();
		
		
		
		
		
		
		
		
		
	}
}
