import java.util.ArrayList;


public class StringNiyeKhela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// charAt testing
		String s = "Welcome To Javatpoint Tutorial";
		System.out.println(s.length());
		
		int count =0;
		for(int i=0; i<s.length(); i++){
			if (s.charAt(i)== 't' || s.charAt(i) == 'T'){
				count ++;
			}
		}
		System.out.println("Count of total T is "+count);
		
		
		// compareTo testing
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = "mello";
		String s4 = "fruits";
		
		System.out.println("\n---- CompareToIgnoreCase ----");
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		
		System.out.println("\n---- CompareTo ----");
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		
		System.out.println("\n---- CompareTo With Empty String ----");
		String fullstring = "hello";
		String blankstring = "";
		String anotherfullstring = "me123";
		
		System.out.println(fullstring.compareTo(blankstring));
		System.out.println(blankstring.compareTo(anotherfullstring));
		
		
		// concat testing
		System.out.println("\n---- concat ----");
		System.out.println(s1.concat(s3));
		System.out.println(s1.concat(" ").concat(s4));
		
		// contains testing
		
		System.out.println("\n ---- contains ----");
		String containstest1 = "Hello World";
		
		System.out.println(containstest1.contains("World"));
		boolean isContains = containstest1.contains("World");
		System.out.println(isContains);
		if (containstest1.contains("Ricky")){
			System.out.println("The word Ricky is found.");
		}
		else
			System.out.println("Ricky not found");
		
		
		// endsWith testing
		
		System.out.println("\n ---- endsWith ----");
		System.out.println(containstest1.endsWith("world"));
		System.out.println(containstest1.endsWith("World"));
		
		// equals testing
		
		System.out.println("\n ---- equals ----");
		
		String testequals = "Mukesh";
		ArrayList<String> list = new ArrayList<>();
		list.add("Ravi");
		list.add("Mukesh");
		list.add("Ramesh");
		list.add("Ajay");
		
		for(String str : list){
			if(str.equals(testequals)){
				System.out.println(str+" is in list.");
			}
		}
		
		// getBytes testing
		
		System.out.println("\n ---- getBytes ----");
		
		String s1bytes = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		byte[] b1 = s1bytes.getBytes();
		
		for(int i=0; i<b1.length; i++){
			System.out.println(b1[i]);
		}
		
		
		// getChars testing -- public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)  
		
		System.out.println("\n ---- getChars ----");
		
		String getCharsString = "hello javatpoint how r u";
		char[] ch = new char[10];
		getCharsString.getChars(6, 16, ch, 0);
		System.out.println(ch);
		
		
		// indexOf testing
		
		System.out.println("\n ---- indexOf ----");
		
		String sindexOf1="this is index of example";  
		//passing substring  
		int index1=sindexOf1.indexOf("is");//returns the index of is substring  
		int index2=sindexOf1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		  
		//passing substring with from index  
		int index3=sindexOf1.indexOf("is",3);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		  
		//passing char value  
		int index4=sindexOf1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3
		
		
		// isEmpty testing
		
		System.out.println("\n ---- isEmpty ----");
		
		String sisEmpty1="";  
		String sisEmpty2="javatpoint";  
		  
		System.out.println(sisEmpty1.isEmpty());  
		System.out.println(sisEmpty2.isEmpty());
		
		// join testing
		
		System.out.println("\n ---- join ----");
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);  
		
		
		// length testing
		
		System.out.println("\n ---- length ----");
		
		String slength1="javatpoint";  
		String slength2="python";  
		System.out.println("string length is: "+slength1.length());//10 is the length of javatpoint string  
		System.out.println("string length is: "+slength2.length());//6 is the length of python string
		
		// replace testing
		
		System.out.println("\n ---- replace ----");
		
		String sreplace1="my name is khan. My name is java";  
		String replaceString=sreplace1.replace("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString);
		
		String sreplace2="javatpoint is a very good website";  
		String replaceString2=sreplace2.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString2); 
		
		
		// split testing
		
		System.out.println("\n ---- split ----");
		
		String splittexts = "java string split method by javatpoint";
		String [] words = splittexts.split("\\s");
		for (String x : words){
			System.out.println(x);
			if (x.equalsIgnoreCase("Javatpoint")){
				System.out.println("Got Mr. Java");
			}
		}
		
		
		// startsWith testing
		
		System.out.println("\n ---- startsWith ----");
		
		String stest = "Javatpoint";
		System.out.println(stest.startsWith("J"));
		System.out.println(stest.startsWith("L"));
		System.out.println(stest.startsWith("v", 2));
		
		
		// substring testing
		
		System.out.println("\n ---- substring ----");
		
		System.out.println(stest.substring(2));
		System.out.println(stest.substring(0, 10));
		System.out.println(stest.substring(5, 9));
		
		
		// Find out User Name
		
		System.out.println("\n ---- Found a word after a special word ----");
		
		String UserName = "You got user MR. Rupam for this word";
		String [] finds = UserName.split("\\s");
		System.out.println(finds.length);
		
		for(int i=0; i<finds.length; i++){
			if(finds[i].equalsIgnoreCase("useR")){
				System.out.println(finds[i+1]+" "+finds[i+2]);
			}
		}
	}

}
