
public class DoubleEqualsWithEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Durga");
		String s2 = new String("Durga");
		
		System.out.println(s1==s2); // Reference comparison which only do when s1 and s2 pointing to same object
		System.out.println(s1.equals(s2)); // Content comparison
	}

}
