package javabase;

public class ToStringMain {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", " d안드로이");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}

}
