import java.util.*;

class StudentListApp {
	String Fname;
	String Lname;
	String Grade;
	public int Mark;
	
	void setData(String Fname, String Lname, int Mark, String Grade) 
    { 
		this.Fname = Fname; 
        this.Lname = Lname;
        this.Mark = Mark;
        this.Grade = Grade;
    }
	public void display() 
    {
        System.out.println(Fname + "  " +Lname+ "   " +Grade); 
    }
}

public class Student {

	public static void main(String[] args) { 
        StudentListApp[] arr;
        int n, mark, hMark = -1, lMark = 10000, total = 0;
        String fname, lname;
        float aMark;
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How many students?");
			n = sc.nextInt();
			arr = new StudentListApp[n];
			System.out.println("Enter student details:");
			for(int i=0; i<n; i++) {
				arr[i] = new StudentListApp();
				System.out.print("First name: ");
				fname = sc.nextLine();
				System.out.print("Last name: ");
				lname = sc.nextLine();
				System.out.print("Mark:");
				mark = sc.nextInt();
				total += mark;
				String grade = gradeTo(mark);
				if(mark > hMark)
					hMark = mark;
				if(mark < lMark)
					lMark = mark;
				arr[i].setData(fname, lname, mark, grade);
			}
		}
        aMark = total/(float)n;
        System.out.println("    Result for section 1     ");
		System.out.println("-----------------------------");
		System.out.println("  Fname    Lname     Grade ");
        for(int i=0; i<n; i++) {
        	arr[i].display(); 
        }
        System.out.println("The highest mark is "+ hMark);
        System.out.format("The average mark is %.2f\n", aMark);
        System.out.println("The lowest mark is "+ lMark);

	}

	private static String gradeTo(int mark) {
		String grade;
		if(mark >= 95 || mark <= 100)
			grade = "A+";
		else if(mark >= 90 || mark <= 95)
			grade = "A";
		else if(mark >= 85 || mark <= 90)
			grade = "B+";
		else if(mark >= 80 || mark <= 85)
			grade = "B";
		else if(mark >= 75 || mark <= 80)
			grade = "C+";
		else if(mark >= 70 || mark <= 75)
			grade = "C";
		else if(mark >= 65 || mark <= 70)
			grade = "D+";
		if(mark >= 60 || mark <= 65)
			grade = "D";
		else
			grade = "F";
		
		return grade;
	}
}
