package javabase;

import java.util.HashSet;

public class HashSetStudentMain {

	public static void main(String[] args) {
		HashSet hashSet= new HashSet();
		
		Student s1 = new Student(1, "둘리");
		hashSet.add(s1);
		System.out.println(hashSet.size());
		
		Student s2 = new Student(1, "둘리");
		hashSet.add(s2);
		System.out.println(hashSet.size());

		Student s3 = new Student(3, "고길동");
		hashSet.add(s3);
		System.out.println(hashSet.size());
		
	}

}
