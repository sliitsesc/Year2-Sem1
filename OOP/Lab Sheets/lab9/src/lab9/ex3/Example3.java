package lab9.ex3;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Example3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Float> heightList = new ArrayList<Float>();
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter height : ");
			float height = scanner.nextFloat();
			
			heightList.add(height);
		}
		
		Set<Float> heightSet = new HashSet<>(heightList);
		Iterator<Float> iterator = heightSet.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
