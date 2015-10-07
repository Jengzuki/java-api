package erums;

import java.util.List;
import java.util.Scanner;

/**
 * @file_name : Toysrus.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 7.
 * @Story	  : 장난감 가게에서 신규로 들어온 상품 등록과 검색
 */
public class Toysrus {
	/**
	 * 장난감이 입고되었을 때, 점원이 바코드번호로 등록하는 과정
	 * 1. setBarcode() : 123456
	 * 2. setName() : 상품명 등록(Enum에 있는 이름)
	 * 3. setUser() : 어른용, 어린이용
	 * 4. setType() : 피규어, 인형
	 */
  public static void main(String[] args) {
	ToyRegister tr = new ToyRegister();
	ToySpec spec = new ToySpec();
	spec.setMap("사용자", ToyUser.어른용);
	spec.setMap("타입", ToyType.피규어);
	tr.regist("스파이더맨", 5000, spec);
	// 등록된 모든 장난감 출력
	List<Toy> list = tr.getAll();
	for (Toy toy : list) {
		System.out.println(toy);
	}
	//이름으로 조회
	System.out.println(tr.searchName("스파이더맨"));
	
	// 검색
  }
}
