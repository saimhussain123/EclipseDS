package mypack;

//added modification


public class Stud {
	String name;
	int roll;
	 
	public Stud(int roll, String name) {
		this.roll=roll;
		this.name=name;
		
	}
	public String toString() {
		return name + "("+roll+")";
	}
}
