package javacollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain2 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		// 객체 저장
		set.add(new Member("둘리", 30));
		set.add(new Member("둘리", 30));
		set.add(new Member("또치", 30));
		set.add(new Member("도우너", 40));
		
		System.out.println(set.size());
		
		for (Member m : set) {
			System.out.println(m.getName() + "\t" + m.getAge());
		}
		
		
	}

}
