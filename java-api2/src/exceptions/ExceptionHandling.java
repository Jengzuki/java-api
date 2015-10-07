package exceptions;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("프로그램이 시작됨");
		int[] arr = { 10, 200, 30 };
		for (int i = 0; i <= arr.length; i++) {
			try {
				System.out.print(arr[i] + "\t");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램이 종료");
	}
}
