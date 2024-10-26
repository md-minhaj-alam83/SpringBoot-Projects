package in.ns.main.beans;

public class Student {

	private String name;
	private int rollNo;
	private float marks;
	
	
	public Student(String name,int rollNo,float marks)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	
	
	public void displayStudentDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("RollNo : "+rollNo);
		System.out.println("Marks : "+marks);

	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
}
