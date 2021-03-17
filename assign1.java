import java.util.Scanner;

public class assign1 {

   public static void main(String[] args) {
  
   try (Scanner in = new Scanner(System.in)) {
	System.out.print("enter first grade: ");
	   double g1 = in.nextInt();
	   System.out.print("enter second grade: ");
	   double g2 = in.nextInt();
	   System.out.print("enter third grade: ");
	   double g3 = in.nextInt();
	   System.out.print("enter fourth grade: ");
	   double g4 = in.nextInt();
	   System.out.print("enter fifth grade: ");
	   double g5 = in.nextInt();
	   
	   double avg = (g1+ g2+ g3+ g4+ g5)/5;
	      
	   System.out.printf("your average grade is: %.2f", avg);
}
      
   }
}