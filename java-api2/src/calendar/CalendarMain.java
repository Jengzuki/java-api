package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @file_name : CalendarMain.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 6.
 * @Story	  : Calendar 클래스
 */
public class CalendarMain {
	/**
	 * 특정일 (2015-9-14) 이로부터 오늘까지 일수 구하기.
	 * 2016-02-05 에서 오느날까지 남은 일수 구하기 (D-18) 
	 */
	public static void main(String[] args) {
		DayCounter day = new DayCounter();
		SimpleDateFormat da = new SimpleDateFormat("yyyy - MM - dd");
		Scanner scanner = new Scanner(System.in);
		System.out.println("날짜를 입력해주세요.");
		String a = scanner.next();
		System.out.println(day.noname());
	}
}
class DayCounter {
	public String noname() {
		Calendar dstDay = Calendar.getInstance(); 
		Calendar today = Calendar.getInstance();
		SimpleDateFormat da = new SimpleDateFormat("yyyy - MM - dd");
		int year = 0 , month = 0, date = 0;
		
		dstDay.set(year, month-1, date);
		dstDay.getTimeInMillis();
		int days= (int) Math.ceil((today.getTimeInMillis() - dstDay.getTimeInMillis())/(24*60*60*1000)); 
		
		
		
		return "며칠 남았냐면 "+ days + "일 남았습니다.";
		
	}
}