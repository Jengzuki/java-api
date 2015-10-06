package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

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
		System.out.println("날짜를 입력해주세요. ex) yyyy-mm-dd");
		String a = scanner.next();
		day.noname(a);
		System.out.println(day.noname(a));
		
	}
}
class DayCounter {
	public String noname(String a) {
		Calendar dstDay = Calendar.getInstance(); 
		Calendar today = Calendar.getInstance();
		
		if (today.getTimeInMillis() > dstDay.getTimeInMillis()) {
			return "오늘보다 과거입니다";
		}
		
		StringTokenizer str = new StringTokenizer(a, "-");
		String year = str.nextToken();
		String month = str.nextToken();
		String dayr = str.nextToken();
		System.out.println(year+month+dayr);
		
		int year1 = Integer.parseInt(year), month1 = Integer.parseInt(month), dayr1 = Integer.parseInt(dayr); 
		//System.out.println(year1+month1+dayr1);		
		dstDay.set(year1 , month1 -1 , dayr1);
		dstDay.getTimeInMillis();
		int days= (int) Math.ceil((dstDay.getTimeInMillis()-today.getTimeInMillis())/(24*60*60*1000)); 
		
		//System.out.println(days);
		
		return "D- "+ days + "일";
		
	}
}