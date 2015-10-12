package map;

import java.util.Scanner;

public class HanbitCom {
	/**
	 * "안녕하세요".substring(0,2); 0이상 2미만
	 * "안녕"
	 */
	public static void main(String[] args) {
		/**
		 * CRUD
		 * Create : 추가
		 * READ :검색
		 * Update : 수정
		 * Delete : 삭제
		 */
		Scanner scanner = new Scanner(System.in);
		MemberService servic = MemberServiceImpl.getServic();
		Member mem = new Member();
		while (true) {
			System.out.println("1 : 회원가입 2 : 로그인 3 : 총 회원수 4: ID검색 5: 비밀번호 수정 6: 회원탈퇴 7: 종료");
		
			switch (scanner.nextInt()) {
		case 1: System.out.println("아이디,비번,이름,나이,주소 입력해주세요");
				servic.join(scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.next());
			break;
		case 2: 
		System.out.println("아이디와 패스워드를 입력하세요");
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
		case 3: System.out.println("회원목록");
				System.out.println(servic.count());   break;
		
		case 4: System.out.println("회원의 아이디를 입력해주세요");
		mem = servic.searchById(scanner.next());
		if (mem != null) {
			System.out.println(mem.toString());
		}else {
			System.out.println("검색할 ID가 존재하지 않습니다.");	
		}
		break;
		case 5:
			System.out.println("ID 확인 : ");
			String id = scanner.next();
			System.out.println("바꿀 비밀번호");
			String pass = scanner.next();
			System.out.println(servic.changeByPass(id, pass));
		break;
		case 6: System.out.println("회원 탈퇴");
			System.out.println("삭제할 ID 입력");
			System.out.println(servic.remove(scanner.next()));
			break;
		case 7:return;
		default:
			break;
		}
		
		
		}
	}
}
