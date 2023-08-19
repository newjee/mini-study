package javacollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		 List<Board> list = new ArrayList<>();
		
		 list.add(new Board("제목1", "내용1", "글쓴이1"));
		 list.add(new Board("제목2", "내용2", "글쓴이2"));
		 list.add(new Board("제목3", "내용3", "글쓴이3"));
		
		 //객체 사이즈
		 int size = list.size();
		 System.out.println(size);
		 System.out.println();
		 
		 //특정 인덱스 객체
		 Board board = list.get(2);
		 System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		 System.out.println();
		 
		 //모든 객체
		 for (int i=0 ; i< list.size(); i++) {
			 Board b = list.get(i);
			 System.out.println(b.getSubject() + "\t" + b.getContent() +"\t" + b.getWriter());
		 }
		 
		 System.out.println();
		 
		 //객체 삭제
		 list.remove(1);
		 list.remove(1);

		 //모든 객체 : 향상 된 for
		 for(Board b : list) {
			 System.out.println(b.getSubject() + "\t" + b.getContent() +"\t" + b.getWriter());
		 }
	}
}
