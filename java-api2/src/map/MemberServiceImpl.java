package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberServiceImpl implements MemberService{
	Map<String,Object> map = new HashMap<String,Object>();
	Member member = new Member();
	
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
			if (temp.getPass().equals(pass) && temp.getId().equals(id)) {
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


	@Override
	public int count() {
		Member mem = new Member();
	
		return 0;
	}

	@Override
	public Member searchById(String id) {
		Member mem = new Member();
		String result = "입력하신 아이디는 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요. ";
		for (int i = 0; i < map.size(); i++) {
			if (map.get(i).equals(id)) {
				mem.toString();
			}else {
				result = "입력하신 아이디는 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요. ";
			}
		}
		return mem;
	}
	

}
