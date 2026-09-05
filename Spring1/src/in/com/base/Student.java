package in.com.base;

public class Student {
  private String rollno;
  private String name;
  private String email;
  public String getRollno() {
	return rollno;
  }
  public void setRollno(String rollno) {
	this.rollno = rollno;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getEmail() {
	return email;
  }
  public void setEmail(String email) {
	this.email = email;
  }
   public void display() {
	   System.out.println(name);
	   System.out.println(email);
	   System.out.println(rollno);
   }
	 
 }
