package grade;
/**
 * @file_name : Grade.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 1.
 * @Story	  : 성적표 관리 객체 클래스
 */
public class Grade {
	private int kor,eng,math;
	private String hak, name; //학번은 유일한 ID
	
	
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getHak() {
		return hak;
	}
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal(){
		return math + kor + eng;
	}
	@Override
	public String toString() {
		return "성적표 [학번 =" + hak + "이름 = " + name + "통합 = "+getTotal()+"]";
	}

}
