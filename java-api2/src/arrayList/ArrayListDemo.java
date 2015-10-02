package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @file_name : ArrayListDemo.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 1.
 * @Story	  : ArrayList 예제
 */

public class ArrayListDemo {
	/**
	 * CRUD 
	 * create 추가, 삽입
	 * read 조회, 검색
	 * update 덮어쓰기
	 * delete 삭제
	 */
	public static void main(String[] args) {
		// Account a = new Account(); // 객체 생성
		List<String> list = new ArrayList<String>(); // deep copy 깊은 복사
		// Create
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("대구"); //중복값 입력 가능
		
		
		List<String> list2 = new ArrayList<String>();
		list2.addAll(list);  
		
		// Read
		// 출력 방법 1. iterator()
		Iterator<String> it = list.iterator(); // shallow copy 얇은 복사
		while (it.hasNext()) {
			System.out.println("출력방법 1 번 : "+ it.next());
		}
		System.out.println("===========");
		//출력방법 2. 확장 for loop
		for (String str : list) {
			System.out.println("출력방법 2 번 : "+str);
		}
		System.out.println("===========");
		//출력방법 3. 검색 
		Iterator<String> it2 = list.iterator();
		String search = "";
		while (it2.hasNext()) {
			search = (String) it2.next();
			if (search.startsWith("대")) { //서울, 부산, 대구 중에서 앞글자가 대자로 시작한다면 
				System.out.println("검색결과 3번: "+search);
				
			}
		}
		
		
		
	}
}