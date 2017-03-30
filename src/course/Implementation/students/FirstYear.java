package course.Implementation.students;

public class FirstYear extends Student implements Examiner  {

// declaring variables 
	private String subject1;
	private String subject2;
	private int marks1;
	private int marks2;
 
	public static int percentage;
    private String year;
    
// constructor with parameters
    public FirstYear(int rollno, String name, int reg_no, String subject1,String subject2, int marks1, int marks2,String year) {
		super(rollno, name, reg_no);
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.year = year;
	}
	

	// setters and getters methods
	

	// gets subject1 value
    public String getSubject1() {
		return subject1;
	}
	
    // sets subject1 value
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	
	// gets subject2 value
	public String getSubject2() {
		return subject2;
	}
	
	// sets subject2 value
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	
	// gets marks1 value
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	
	// gets marks2 value
	public int getMarks2() {
		return marks2;
	}
	
	// sets marks2 value
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	
	

	// gets year value
    public String getYear() {
		return year;
	}

 // sets year value
	public void setYear(String year) {
		this.year = year;
	}
	// overriding interface methods for implementation
	
	@Override
	// generates grade
	public int Grade() {
		percentage=(this.getMarks1()+this.getMarks2())/2;
		if(percentage>75){
			System.out.println(" A Grade ");
		}else if(percentage>65 && percentage<75){
			System.out.println(" B Grade");
		}
		else if(percentage>35 && percentage<65)
		{
			System.out.println(" C Grade ");
		}
		else{
			System.out.println(" D Grade");
		}
		return 0;
	}
	
	// generates marks obtained
	@Override
	public int marks() {
		System.out.println(subject1 +" = "+marks1);
		System.out.println(subject2 +" = "+marks2);
		int total= marks1+marks2;
		System.out.println("Total"+" = "+total);
		percentage=(this.getMarks1()+this.getMarks2())/2;
		System.out.println("Percentage "+" ="+percentage);
		return 0;
	}
	
	// gives result pass or not
	@Override
	public int result() {
		if(marks1>=35 && marks2>=35){
			System.out.println(" Passed ");
		
		}else{
			System.out.println(" failed");
		}
		return 0;
	}


	@Override
	public int studentinfo() {
		
		System.out.println("Name :" +"="+this.getName());
		System.out.println("Roll no "+"="+this.getRollno());
		System.out.println("Registration no"+"="+this.getReg_no());
		System.out.println("Year"+"="+this.getYear());
		return 0;
	}
	
	
	
}
