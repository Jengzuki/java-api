package stromg;
/**
 * @file_name : StringMethod.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 5.
 * @Story	  : java.lang.String
 */
public class StringMethod {
	public static void main(String[] args) {
		System.out.println("abcde".contains("f") ? "f가 존재" : "f가 존재하지 않음");
		/**
		 * str1 과 str2가 같음, str1과 str2가 다름
		 */
		String str1 = "abc";
		String str2 = "abc"; //abc라는 리터럴 값이 상수풀에 존재하는지 체크
		System.out.println((str1 == str2) ? "str1과 str2가 같음" : "str1과 str2가 다름");
		System.out.println((str1.equals(str2)) ? "str1과 str2가 같음" : "str1과 str2가 다름");
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println((str3 == str4) ? "str1과 str2가 같음" : "str1과 str2가 다름");
		System.out.println((str3.equals(str4)) ? "str1과 str2가 같음" : "str1과 str2가 다름");
		/**
		 * == : 주소값 비교, 주소까지 같은 완전동일 객체
		 * equals() : 실제값(value) 비교, 주소는 상관없고 이름만 동일한 지 체크
		 */
		String str5 = "abc";
		String str6 = new String("abc");
		System.out.println((str5 == str6) ? "str1과 str2가 같음" : "str1과 str2가 다름");
		System.out.println((str5.equals(str6)) ? "str1과 str2가 같음" : "str1과 str2가 다름");
		
		//"Hello.txt"는 리터럴 객체이다
		System.out.println("Hello.txt".endsWith("txt") ? "텍스트 파일입니다." : "텍스트파일이 아닙니다.");
		System.out.println("헬로우".concat(", 자바월드 ||")); //헬로우, 자바월드||
		System.out.println("HELLO".equals("hello") ? "같습니다." : "다릅니다"); // 다릅니다.
		System.out.println("HELLO".equalsIgnoreCase("hello") ? "같습니다." : "다릅니다"); //같습니다.
		System.out.println("Hello Tom".replace("Tom", "Alex")); //Hellow Alex
		/**
		 * JDK 5버전 이전에는 replace() replaceAll()이 서로 다르게 반응했으나 이후에는 서로 같은 기능(전부 체인지되는 기능)으로
		 * 바뀌었음. 그럼 차이점이 없는가? 하면 정규식에 대한 기능이 있는 가 없는가의 차이점이 있다.
		 * replace()는 기능이 없고 replaceAll() 은 기능이 있다. 따라서 replaceAll()을 쓰도록 권고되고 있다.
		 */
		System.out.println("[1]A B C D : A B C D".replace("C D", "E F"));
		System.out.println("[2]A B C D : A B C D".replaceAll("C D", "E F"));
		/**
		 * . 은 정규식에서 쓰이는데 맨 앞 한글자만 지정합니다.
		 * 그러니까 .a 는 a앞에 글자와 a까지를 뜻합니다.
		 * 아래 예제에서 replace() 는 .을 정규식 표현법으로 보질 않고 리터럴의 마침표로 인식함으로 프로그래밍에서 자주 사용하는
		 * 정규식을 적응할 수 없게 됩니다.
		 */
		System.out.println("[3] Hello Java ".replace("a", "")); //[3] Hello Jvn
		System.out.println("[4] Hello Javan ".replaceAll(".a", "")); //[4] Hello n

		System.out.println();
		System.out.println();
		
	}
}
