import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       //replace question with any question
       String questions[] = {"who is gon's bestfriend?","What is Ronaldo's first name?","What is Ali's car name?","Where is Tajmahal situated?","India's Capital City?"};
      
       //put options for each question
       String options[][] = {{"Kurapika","Leorio","Killua"},{"Cristiano","Lionel","Sergio"},{"Bmw","Audi","Bugati"},{"Delhi","Agra","Mumbai"},{"Kolkata","Bangalore","Delhi"}};
      
       //set correct answer for each question
       int correctAnswer[] = {1,1,2,2,3};
      
       try (//scanner for user input
	Scanner sc = new Scanner(System.in)) {
		//store number of right answers
		   int rightAnsCount=0;
		  
		   //for user choice
		   int userChoice;
		  
		   //store number of questions
		   int totalNumberOfQuestion=0;
		   for(int i=0;i<questions.length;i++) {
		       //increase number of questions
		       totalNumberOfQuestion++;
		       //print question3
		       System.out.println(questions[i]);
		       //print options
		       for(int j=0;j<options[i].length;j++) {
		           System.out.println("\t"+options[i][j]);
		       }
		       //ask for input
		       System.out.print("Enter your choice (1,2,or 3) : ");
		       //get user answer
		       userChoice = sc.nextInt();
		       //check if user answer is same as correct answer
		       if(userChoice==correctAnswer[i]) {
		           //increase number of right count
		           rightAnsCount++;
		       }
		   }
		   System.out.println("Total number of questions : "+totalNumberOfQuestion);
		   System.out.println("Total number of right answers : "+rightAnsCount);
	}
   }
}