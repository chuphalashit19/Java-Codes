import java.util.*;
public class StackSumPairs {
	
	public static void sumPairs(Stack<Integer> stack, int n) {
		int i, y, z, sum;
		Stack<Integer> newstack = new Stack<Integer>();
		for(i = 0; i < n; i++) 
        {
			if(i == 0) {
				y = stack.get(i);
				newstack.push(y);
			}
			if (i%2 != 0) {
				y = stack.get(i);
				z = stack.get(i+1);
				sum = y+z;
				newstack.add(sum);
			}
        }
		System.out.println("Before:");
		System.out.print("bottom[");
		for(i=0; i<stack.size(); i++) {
			if (i != stack.size()-1) {	
				System.out.print(stack.get(i));
				System.out.print(", ");
			}
			else {
				System.out.print(stack.get(i));
				System.out.print("]top");
			}
		}
		System.out.println("\n\nAfter:");
		System.out.print("bottom[");
		for(i=0; i<newstack.size(); i++) {
			if (i != newstack.size()-1) {	
				System.out.print(newstack.get(i));
				System.out.print(", ");
			}
			else {
				System.out.print(newstack.get(i));
				System.out.print("]top");
			}
		}
	}

	public static void main(String[] args) {
		int i, n, item;
		try (Scanner sc = new Scanner(System.in)) {
			Stack<Integer> stack = new Stack<Integer>();
			System.out.print("Enter # of elements: ");
			n = sc.nextInt();
			for(i=0; i<n; i++) {
				item = sc.nextInt();
				stack.add(item);
			} 
			sumPairs(stack, n);
		}
	}
}
