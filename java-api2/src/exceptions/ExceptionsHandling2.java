package exceptions;

public class ExceptionsHandling2 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int i = 50;
		int data = 0;
		try {
			data = Integer.parseInt("a");
			System.out.println(i/data);
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("숫자가 아닙니다.");
		} 
		
		System.out.println("프로그램 종료");
		
	}
}
