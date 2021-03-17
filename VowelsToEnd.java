public class VowelsToEnd {
	public static String v = "";
	public static String newstr = "";
	public static int i = 0, j = 0;
	static String vowelsToEnd(String str) {
		if(j == str.length()) {
			int m;
			for(m=0; m<str.length(); m++)
			{
				if(str.charAt(m) == 'a' || str.charAt(m) == 'e' || str.charAt(m) == 'i' || str.charAt(m) == 'o' || str.charAt(m) == 'u')
				{
					v += str.charAt(m);
				}
				
				else {
					newstr += str.charAt(m);
				}
			}
			StringBuilder sb = new StringBuilder(v);
			sb.reverse();
			newstr = newstr + sb.toString();
			return newstr;
		}
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
			str = str + str.charAt(i);
			StringBuilder sb = new StringBuilder(str);
			sb = sb.deleteCharAt(i); 
			str = sb.toString();
			j ++;
			vowelsToEnd(str);
		}
		else {
			i++;
			j++;
			vowelsToEnd(str);
		}
		return newstr;
	}
	public static void main(String[] args) {
		System.out.println(vowelsToEnd("beautifully"));
	}
}
