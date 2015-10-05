package map;

public interface MemberService {
	// 회원가입
	public void join(String id, String pass, String name, String age, String addr);
	// 로그인
	public String login(String id, String pass);
	//총 회원수
	public int count();
	// 아이디검색
	public Member searchById(String id);
	// 비번 변경
	public String changeByPass(String id ,String pass);
	// 회원타ㄹ퇴
	public String remove(String id);
	
	
}
