package course.Implementation.students;

public abstract class Student {

  // declaring variables
  private int rollno;
  private String name;
  private int reg_no;
  
  // Constructor with variables
public Student(int rollno, String name, int reg_no) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.reg_no = reg_no;
}

// setters and getters methods

// gets roll no value
public int getRollno() {
	return rollno;
}

// sets roll no value
public void setRollno(int rollno) {
	this.rollno = rollno;
}

// gets Name value
public String getName() {
	return name;
}

// sets name value
public void setName(String name) {
	this.name = name;
}

// gets reg_no  value
public int getReg_no() {
	return reg_no;
}

// sets reg_no value
public void setReg_no(int reg_no) {
	this.reg_no = reg_no;
}

}
