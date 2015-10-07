package erums;

import java.util.Scanner;

/**
 * @file_name : ErumMain.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 7.
 * @Story	  : 열거형
 */
public class ErumMain {
	/**
	 * 숫자값을 입력하면, 숫자값에 해당하는 방향이 스트링오로 나오게끔
	 * [동쪽으로 이동합니다] 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Navigation na = new Navigation();
		System.out.println("가고자 하는 방향을 정하세요. 동 :1 서 :2 남 :3 북 :4");		
		na.setDrection(scanner.nextInt());
		System.out.println(na.getDrection());

	}
}

	

