package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @file_name : ArrayListNote.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 1.
 * @Story	  : ArrayList 와 Vector 비교 
 */
public class ArrayListNote {
	/**
	 * [List 와 배열 비교]
	 * (1) 생성된 이후 크기 확장 여부
	 *  - 배열은 동적 생성이 되지만 String[] $ = {"",""} , 한번 만들 때 정한 크기 이상은 추가할 수 없음
	 *  - List 는 동적생성은 물론이고, 추가할 때 크기 제한이 없음
	 * (2) 배열은 업/다운 캐스팅이 되는데, 리스트는 되지 않음
	 * 
	 * [ArrayList 와 Vector 비교]
	 *  - Vector 는 내부적으로 String 사용, 속도 드림, 동기화 지원.
	 *  - ArrayList 는 내부적으로 StringBuffer 사용, 동기화 지원 안함.
	 *  
	 *  [List 타입 객체에 ArrayList 로 Deep copy 하는 이유]
	 *  - 동기화 / 동시성에 관한 내용
	 *  - List 자료구조를 동기화해서 사용하게 된다면 (이말은 Vector 가 아닌 ArrayList를 사용한다면)
	 *  List<String> list = new ArrayList<String>(); 형식으로 
	 *  깊은 복사해서 synchronized(동기화) 되는 시간을 최대한 짧게 줄일 수 있다.
	 */
	 public static void main(String[] args) {
		String[] strArr = new String[5];
		Object[] objArr = new Object[5];
		String[] strArr2 = (String[]) objArr;
		Object[] abjArr2 = strArr;
		
		List<String> strList = new ArrayList<String>(); // CTRL + SHIFT + o
		List<Object> objList = new ArrayList<Object>();
		//List<Object> objList2 = strList; 업캐스팅 실패
		//List<String> strList2 = objList; 다운캐스팅 실패
		
	}
}
