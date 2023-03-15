package studentdb;
import java.util.Scanner;

public class Student {
	
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentId;
	private String courses="";
	private int tutionBalance=0;
	private static int costofCourse=600;
	private static int id=1000;
	private int rBalance;
	private int payment;
	
	
	
	// constructor for name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First name:-");
		this.firstname=in.nextLine();
		
		System.out.print("Enter Student Last name:-");
		this.lastname=in.nextLine();
		
		System.out.print(" 1-Firstyear\n 2-Second year\n 3-Third year\n 4-Final year\n Enter Student GradYear:-");
		this.gradeyear=in.nextInt();
		setId();
	}
	
	//generate the id 
	private void setId(){
			id++;
	this.studentId=gradeyear+""+id;	
	}
	
	
	// enroll in courses
	public void Enroll() {
		do {
			System.out.print("Enter to Enroll (Q to Quite):-");
			Scanner in=new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q"))  {
				courses = courses +"\n "+course;
				tutionBalance=tutionBalance+costofCourse;
		}
			else {break;}
		}while(1!=0);
		
		}
	
	
	//view balance
public  void viewBalance() {
	System.out.println("Your Balance is:- " + rBalance);}


//pay tuition
public void payFees() {
	
	System.out.println("The Amount need to be paid:-"+ costofCourse);
	System.out.print("Enter Your Payment:- ");
	Scanner in=new Scanner(System.in);
	payment=in.nextInt();
	if(payment>costofCourse) {
		System.out.println("Invalid Amount");
		System.out.println("Enter the valid amount");
		payFees();
	}
	 rBalance = tutionBalance - payment;
	}



//show status
public String toString()
{
	return "=============================="+
			"Name:-" +firstname +" "+lastname+ 
			"\nID:- "+studentId+
			"\nGrade Level:-"+gradeyear+
			"\ncourses enrolled:-"+ courses +
			"\nTuition Fee:-"+tutionBalance+
			"\nAmount Paid:-"+payment+
			"\nRemaining Balance:- "+rBalance ;
			
}
}

	
	
	
	



