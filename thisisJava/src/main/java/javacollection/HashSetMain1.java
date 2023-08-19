package javacollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetMain1 {

	public static void main(String[] args) {
		//hashset 컬렉션
		Set<String> set = new HashSet<>();
		
		// 객체 저장
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		
		// 객체수
		int size = set.size();
		System.out.println(size);
		
		// 객체 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("");
		for(String element : set) {
			System.out.println(element);
		}
	}

}
