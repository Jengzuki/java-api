package grade;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.SynchronousQueue;

public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Grade> vec = new Vector<Grade>();
		GradeService service = new GradeServiceImple();
		DescTotal desort = new DescTotal();
		AscName arx = new AscName();
			
		while (true) {
			System.out.println("1: 성적등록 2: 학적부리스트 3: 학번으로 검색 4: 이름으로 검색 "
					+ "5:성적순으로 순위 출력 6: 성적순으로 이름순위 7. 이름 순서대로. 8: 종료");
			switch (scanner.nextInt()) {
			case 1:System.out.println("학번을 입력해주세요.");
				String hak = scanner.next();
				System.out.println("이름을 입력해주세요");
				String name = scanner.next();
				System.out.println("국어 점수를 입력하세요");
				int kor = scanner.nextInt();
				System.out.println("영어 점수를 입력하세요");
				int eng = scanner.nextInt();
				System.out.println("수학점수를 입력하세요");
				int math = scanner.nextInt();
				service.input(hak,name,kor,eng,math);
				break;
			case 2: System.out.println("학적부 리스트");
			System.out.println(service.getList());
				break;
			case 3: System.out.println("찾을 번호를 적어주세요");
				String retr = scanner.next();
				System.out.println(service.searchByHak(retr));
				break;
			case 4: System.out.println("이름을 입력해주세요");
			 	String name2 = scanner.next();
			 	System.out.println(service.searchByName(name2));
			 	
				break;
			case 5:	System.out.println("성적순으로 순위 출력");
				System.out.println(service.descGradeByTotal().toString());
				
				break;
			case 6:	System.out.println("성적순으로 이름순위 출력");
			System.out.println(service.ascGradeByName().toString());
				break;
			case 7: System.out.println("이름 순위 출력");
			System.out.println(service.ascGradeByName().toString());
			break;
			case 8:return;
			default:break;
			}
		}
	}
}
