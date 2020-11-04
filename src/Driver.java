import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Daniel Carpenter
 */
public class Driver {
	public static void main(String[] args) {

		// Q1 --------------------------------------------------------------------

			// Create Base List
			ArrayList<Integer> list = new ArrayList<Integer>();
	
			// Non-unique list
			list.add(3);
			list.add(3);
			list.add(1);
			list.add(1);
			list.add(2);
	
			// Show how you would use Set to find the unique elements in a List.
			Set<Integer> set = new HashSet<Integer>();
	
			// Add unique Integers to set
			for (Integer i : list) {
				set.add(i);
			}
	
			System.out.println("Q1: Unique Integers from list: " + set.toString());

		// Q2 ----------------------------------------------------------------------
			
			System.out.println("\nQ2: Ordering Example: ----------------------------");
			HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
			TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>();
			
			for (Integer i : list) {
				hash.put(i, i);
				tree.put(i, i);
			}
			for (Integer i : hash.keySet()) {
				System.out.println("Hash: " + hash.get(i));
			}
			for (Integer i : tree.keySet()) {
				System.out.println("Tree: " + tree.get(i));
			}
			
			// use a treemap to guarentee the order
	}
}
