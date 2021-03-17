public class intlist {
	private static int cnt=0;
	public static int[] myArr = new int[100];
	
	public static int listcount(){
		cnt = 0;
		int i;
		for(i=0; i<100; i++) {
			if (myArr[i] != 0) {
				cnt += 1;
			}
		}
		return cnt;
	}
	public static void addfirst(int x) {
		int i;
		if (listcount() == 0)
			myArr[0] = x;
		else {
			for(i=listcount(); i>=0; i--) {
				myArr[i+1] = myArr[i]; 
			}
			myArr[0] = x; 
		}
		
	}
	public static void addlast(int x) {
		int len = listcount();
		myArr[len] = x;
	}
	public static void removeall() {
		int i;
		for(i=0; i<listcount(); i++) {	
			if(myArr[i]!=0) {
				myArr[i] = 0;
			}
		}
		
	}
	public static void removefirst() {
		int i;
		for(i=0; i<listcount(); i++) {
			myArr[i] = myArr[i+1];
		}
		myArr[listcount()] = 0;
	}
	public static void removelast() {
		myArr[listcount()-1] = 0;
	}
	public static void remove(int i) {
		int j, k;
		for(j=0; j<listcount(); j++) {
			if(j == i) {
				for(k=i; k<listcount(); k++)
					myArr[k] = myArr[k+1];
			}
		}
	}
	public static void main(String[] args) {
		int i = 0;
		addfirst(10);
		addfirst(20);
		addfirst(30);
		addlast(40);
		addfirst(70);
		addfirst(50);
		addlast(80);
		for(i=0; i<listcount(); i++) {
			System.out.println(myArr[i]);
		}
		System.out.println("List Count : " + listcount());
		removefirst();
		for(i=0; i<listcount(); i++) {
			System.out.println(myArr[i]);
		}
		System.out.println("List Count : " + listcount());
		removelast();
		for(i=0; i<listcount(); i++) {
			System.out.println(myArr[i]);
		}
		System.out.println("List Count : " + listcount());
		remove(2);
		for(i=0; i<listcount(); i++) {
			System.out.println(myArr[i]);
		}
		System.out.println("List Count : " + listcount());
		removeall();
	}
}