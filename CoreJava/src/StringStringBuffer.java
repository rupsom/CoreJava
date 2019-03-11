
public class StringStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("Java"); //Immutable class
		s.concat("Durga");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Dugra"); //Mutable class
		sb.append("Java");
		System.out.println(sb);
	}

}
