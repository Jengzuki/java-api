package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @file_name : YunaKim.java
 * @author : apfl1@naver.com
 * @date : 2015. 10. 2.
 * @Story : HushMap 예제
 */
public class KimYunA {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("김연아", new Integer(98)); // Integer i = new Integer(98) ->  int i= 98
		map.put("아사다 마오", new Integer(66));
		map.put("소트니 코바", new Integer(10));
		
		Set set = map.entrySet();
		Iterator it = set.iterator(); // shallow copy
		while (it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println("참가자 : "+ e.getKey()+", 점수 : "+ e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : "+set); // 자료구조는 내부적으로 for문과 toString() 내장되어 있다.
		
		Collection values = map.values();
		it = values.iterator();
		int total = 0;
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		
		System.out.println("대회총점 : " + total);
		System.out.println("대회평균 : " + total/set.size());
		System.out.println("대회최고점 : "+ Collections.max(values));
		System.out.println("대회최저점 : "+ Collections.min(values));
	}
}
