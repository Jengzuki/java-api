package map;

import java.util.Scanner;

public class HanbitCom {
	/**
	 * "안녕하세요".substring(0,2); 0이상 2미만
	 * "안녕"
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberService servic = new MemberServiceImpl();
		
		while (true) {
			System.out.println("1 : 회원가입 2 : 로그인 3 : 총 회원수 4: ID검색 5: 종료");
		
			switch (scanner.nextInt()) {
		case 1: System.out.println("아이디,비번,이름,나이,주소 입력해주세요");
				servic.join(scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.next());
			break;
		case 2: 
		System.out.println("아이디를 입력하세요");
		String str = servic.login(scanner.next(), scanner.next());
		String flag = str.substring(0, 2); //일치하면 "환영"
		switch (flag) {
		case "환영": System.out.println(str);break;
		//현실에서는 로그인 페이지 전환
		case "비번": System.out.println(str);break;
		//현실에서는 로그인 페이지 다시 보여줌
		case "입력": System.out.println(str);break;
		// 현실에서는 회원가입 페이지 보여줌
		default: break;
		}
		break;	
		case 3: break;
		case 4: System.out.println("회원의 아이디를 입력해주세요");
		String id = scanner.next();
			System.out.println(servic.searchById(id));	
		break;
		case 5:return;
		default:
			break;
		}
		
		
		}
	}
}
