import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Som");
		al.add("Rupam");
		al.add("Pinky");
		al.add("Ricky");
		al.add("OPT");
//		al.add("Pinky");
//		al.add("Ricky");
//		al.add("Som");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("OPT");
		al2.add("Onprocess");
		
//		al.addAll(al2); // Add all from al2 to al and show all
//		al.removeAll(al2); // Remove all al2 from al and if anything matches between al and al2 that will also be removed. Show only non matches and values from al.
//		al.retainAll(al2); // Remove all only show whatever matches between al and al2
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(1);
		al3.add(2);
		
//		al.addAll(al3); // Error appear
		
		for(String s: al){
			System.out.println(s);
		}
		
		System.out.println("******************");
		System.out.println(al.get(2));
		
		
		System.out.println("****************** forwarding *****************");
		
		ListIterator<String> itr=al.listIterator(); 
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("****************** traversing *****************");
		
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
			
		// Redundancy data is there or not
		Set<String> set = new HashSet<String>(al);
		if (set.size()<al.size())
			System.out.println("Redundancy is in ArrayList");
		
		// brute force method
		for (int i = 0; i < al.size(); i++) { 
			for (int j = i + 1; j < al.size(); j++) { 
				if (al.get(i).equals(al.get(j)) ) { 
					// got the duplicate element } } }
					System.out.println("Duplicate value is "+al.get(i));
				}
			}
		}
		
		// Second solution : use HashSet data structure to find duplicates


		System.out.println("--------------------------------------------------------");
		Set<String> store = new HashSet<>(); 
		for (String name : al) { 
			if (store.add(name) == false) { 
				System.out.println("found a duplicate element in array : " + name); 
				} 
			}
		
		System.out.println("------------------- Ascending Order ---------------------");
		TreeSet<String> tes = new TreeSet<String>(al);
		for(String as : tes){
			System.out.println("in order - "+as);
		}
	}

}
