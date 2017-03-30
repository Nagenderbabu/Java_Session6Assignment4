package course.Implementation.students;

public class ResultProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //  initializing implemented(FirstYear) class which extended Student Class and referring it to interface class(examiner) object
		Examiner e1=new FirstYear(1,"arun", 5015,"maths","science", 70, 65,"First");
		 //  initializing implemented(SecondYear) class which extended Student Class and referring it to interface class(examiner) object
		Examiner e2=new SecondYear(2,"ashok", 6065,"maths","science", 80, 75,"Second");
		
	    // displays first year student result
	    System.out.println("-------**** First year results****----------");
	    // displays student info
	    System.out.println("Personal Info :");
	    e1.studentinfo();
	    // displays student marks
	    System.out.println("Marks sheet :"); 
	    e1.marks();
	    // displays student result(passed/fail)
		System.out.println(" Performance :");
	    e1.result();
		//displays student grade
	    System.out.println(" Grade obtained :");
		e1.Grade();
		
		// displays Second year student result
	System.out.println("---------**** Second Year Results****----------");
	// displays student info    
	System.out.println("Personal Info :");
	e2.studentinfo();
	// displays student marks   
    System.out.println("Marks sheet :");
	e2.marks();
	// displays student result(passed/fail)
	System.out.println(" Performance :");
	    e2.result();
	   // displays student grade
	    System.out.println(" Grade obtained :");
	    e2.Grade();
	}
	

}
