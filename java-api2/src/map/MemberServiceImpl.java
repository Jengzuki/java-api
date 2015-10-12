package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberServiceImpl implements MemberService{
	Map<String,Object> map = new HashMap<String,Object>();
	Member member = new Member();
	private static MemberService servic = new MemberServiceImpl();
	
	
	public static MemberService getServic() {
		return servic;
	}

	
	
	@Override
	public void join(String id, String pass, String name, String age, String addr) {
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setAge(age);
		member.setAddr(addr);
		map.put(id, member);
	}
		
	@Override
	public String login(String id, String pass) {
		/**
		 * 환영합니다.  서울에 사시는 30세 홍길동님.
		 * 비번이 다릅니다. 다시 입력하세요.
		 * 입력하신 아이디는 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요.
		 * Map 에서 밸류값만 가져오는 메소드는 map.get("키값")
		 */
				
		
		String str = "";
		//Member temp = (Member) map.get(id);
		if (map.containsKey(id)) {//맵에 키값으로 검색 ID가 있다면
			Member temp = new Member();
			temp =(Member) map.get(id); // why? 맵에서 value가 오브젝트이기 때문
			if (member.getPass().equals(pass)) {
				str = "환영합니다."+temp.getAddr()+"에 사시는 "+temp.getAge()+"세 "+temp.getName()+"님";
			} else {
				str = "비번이 다릅니다. 다시 입력해주세요";
			}
		}else{ 
			str = "입력하신 아이디는 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요.";
		}
			
	
		/**
				str = temp.getAddr()+"에 사시는 "+temp.getAge()+"세의 "+temp.getName()+"님 어서오세요.";
		} else if (temp.getId().equals(id)) {
			 str = "비번이 다릅니다. 다시입력해주세요";
		}else {
		 str = "입력하신 아이디는 존재하지 않거나, 일치하지 않습니다. 다시입력해주세요.";
		}
		*/
		return str;
	}

/**
 * 전체회원수
 */
	@Override
	public int count() {
		return map.size();
	}

	@Override
	public Member searchById(String id) {
		/**Member temp = (Member)map.get(id);
		Member result = null;
		if (id.equals(temp.getId())) {
			result = temp;
			}
		
		return result;
		*/
		return (Member)map.get(id);
	}
/**
 * 비번변경
 */

	@Override
	public String changeByPass(String id ,String pass) {
		String result = "";
		Member target = (Member) map.get(id);
		if (target != null) {
			target.setPass(pass);
			result = "비밀번호가 변경되었습니다.";
		}else {
			result = "아이디가 없습니다. 다시 입력해주세요.";
		}
		return result;
	}

@Override
public String remove(String id) {
	String result = null;
	Object n = map.remove(id); // 리턴값이 value
	if (n != null) {
		result = "입력하신 ID : " + id + "가 삭제되었습니다.";
		} 
	else {
		result = "삭제하려는 ID가 없습니다. 다시 입력해주세요.";
	}
	
	return result;
}

}
