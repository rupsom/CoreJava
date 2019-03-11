import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <Integer, String> map = new HashMap <Integer, String>();
		map.put(100, "Rupam");
		map.put(102, "Pinky");
		map.put(105, "Som");
		map.put(103, "Ricky");
		map.put(104, "");
		map.put(null, "Ricky");
		map.put(null, "Mukherje");
		
		for(Map.Entry m: map.entrySet()){
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
		System.out.println("********************************************");
		Map <Integer, String> treeMap = new TreeMap <Integer, String>();
		treeMap.put(1, "Rupam");
		treeMap.put(4, "Pinky");
		treeMap.put(3, "Som");
		treeMap.put(2, "Ricky");
		treeMap.put(5, "");
//		treeMap.put(null, "Mukherje");
		
		for(Map.Entry m1: treeMap.entrySet()){
			System.out.println(m1.getKey() + " " +m1.getValue());
		}
	}

}
