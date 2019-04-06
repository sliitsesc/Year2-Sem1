package lab9;

import java.util.*;

public class Example1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();
		int total = 0;
		
		if(arrayList.isEmpty()){
			for (int i = 0; i < 10; i++) {
				System.out.print("Enter num " + (i+1) + ": ");
				int num = scanner.nextInt();
				arrayList.add(num);
			}
		}
		
		for (Integer integer : arrayList) {
			System.out.print(integer + " ");
			total += integer;
		}
		
		System.out.println("\n Total : " + total);
	}
}
