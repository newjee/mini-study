package javabase;

public class HashStudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "둘리");
		Student s2 = new Student(1, "둘리");

		if (s1.hashCode() == s2.hashCode()) {
			if (s1.equals(s2)) {
				System.out.println("같은 객");
			} else
				System.out.println("데이터 다");

		} else
			System.out.println("해시 다름");
	}

}
