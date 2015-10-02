package grade;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

import javax.lang.model.element.Element;

public class GradeServiceImple implements GradeService{
	ArrayList<Grade> vec = new ArrayList<Grade>();
	DescTotal desort = new DescTotal();
	AscName arx = new AscName();
		
	/**
	 * 학생을 성적부에 등록하기 힌트) 벡터 메소드 중에 한 객체만 넣는 메소드를 사용하세요. = 연산자는 안됨
	 * 한줄 코딩으로 끝.
	 */
	@Override
	public void input(String hak, String name, int kor,int eng,int math) {
		Grade grade = new Grade();
		grade.setHak(hak);
		grade.setName(name);
		grade.setKor(kor);
		grade.setEng(eng);
		grade.setMath(math);
		vec.add(grade);
		
	}
	/**
	 * 학적부에 등록된 전체 학생 리스트 출력
	 * 힌트) 필드에 있는 객체에 모든 학생 리스트가 있을 것이다. 
	 * 필드 객체 값을 지역변수에 할당하자.
	 */

	@Override
	public ArrayList<Grade> getList() {
	//	ArrayList<Grade> temp = new ArrayList<Grade>();
	//  temp.addAll(vec);
		return vec;
	}
	/**
	 * 학번으로 벡터를 뒤져서 일치하는 학번 한개만 리턴하기.
	 * Account와 흡사.
	 */
	@Override
	public Grade searchByHak(String hak) {
		Grade grade = new Grade();
		for (int i = 0; i < vec.size(); i++) {  //천 대신에 벡터의 length를 구하는 메소드 찾아 놓을 것 
			if (vec.get(i).getHak().equals(hak)) {
				grade = vec.get(i);
			}
		}
		return grade;
	}
	/**
	 * 이름으로 학적부에 등록된 학생 정보 전부 검색하기.(동명이인일 경우 전부 검색)
	 */
	@Override
	public ArrayList<Grade> searchByName(String name) {
		ArrayList<Grade> temp = new ArrayList<Grade>();
		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i).getName().equals(name)) {
				temp.add(vec.get(i));
			}
		}
		return temp;
		}
	
	@Override
	public ArrayList<Grade> descGradeByTotal() {
		Collections.sort(vec, desort);
			return vec;
	}

	@Override
	public ArrayList<Grade> ascGradeByName() {
		Collections.sort(vec, arx);
		return vec;
	}
	public void descTotal(){
	
		
	}
	public void ascTotal(){
		
		
	}
}
