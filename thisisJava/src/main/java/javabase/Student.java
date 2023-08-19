package javabase;

public class Student {
	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;

	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

//	@Override
//	public int hashCode() {
//		int hashCode = no + name.hashCode();
//		return hashCode;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof HashStudent target)
//			if (no == target.getNo() && name.equals(target.getName()))
//				return true; // target <- Hashstudent의 인스턴스
////		return false;
//
//	}
}
