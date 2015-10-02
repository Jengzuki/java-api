package grade;

import java.util.Vector;

public interface GradeService {
	public void input(String hak, String name, int kor,int eng,int math);
	public Vector<Grade> getList(); 
	public Grade searchByHak(String hak);
	public Vector<Grade> searchByName(String name);
	public Vector<Grade> descGradeByTotal(); // 성적을 내림차순으로 정렬 (300,270,230....)
	public Vector<Grade> ascGradeByName();   // 성적을 이름에 따라 오름차순(ㄱ,ㄴ,ㄷ,ㄹ...)
}
