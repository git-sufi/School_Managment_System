package studentdb;

public class StudentdbApp{

	public static void main(String[] args) {
		
		// how many users
		System.out.print("Enter number of student to enroll");
		Scanner in=new Scanner(System.in);
		int numofstudent=in.nextInt();
		Student[] students=new Student[numofstudent];
		
		//create n number of student
		for(int n=0;n<numofstudent;n++) {
	    students[n]=new Student();
	    students[n].Enroll();
	    students[n].payFees();
		}
		for(int n=0;n<numofstudent;n++) {
			System.out.println(students[n].toString());
		}
	}
}
