package string;
/**
 * @file_name : StringBufferMain.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 6.
 * @Story	  : StringBuffer 문법
 */
public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("java"+"programming"); //두개의 주소값참조 => 비추
		System.out.println(sb.append("java").append("programming").toString()); //결합시킨 하나의 주소값 참조
		//.append().append().toString. 체이닝기법
		System.out.println(sb.length());//문자수
		System.out.println(sb.capacity());//할당된 배열사이즈
		sb.replace(0, 4, "C++"); //0이상 : 시작 index, 4 미만 : 끝 index는 불포함. 
		System.out.println(sb);
		System.out.println(sb.reverse()); // gnimargorp++C  <- 역전
		System.out.println(sb.reverse()); // C++ Programing <-
		System.out.println(sb.substring(11)); // 11번째 인덱스부터 끝까지.
		StringBuffer sb1 = new StringBuffer("홍길동");
		StringBuffer sb2 = new StringBuffer("홍길동");
		System.out.println(sb1==sb2); 		 	//만약 String 이라면 reference 비교 => "false"
		System.out.println(sb1.equals(sb2));   // String 이라도 value 비교 = true
		/**
		 * StringBuffer 는 무조건 래퍼런스(주소값) 비교만 한다.
		 */
	}
}
