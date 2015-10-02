package grade;

import java.util.Comparator;

public class AscName implements Comparator<Grade> {

	@Override
	public int compare(Grade front, Grade back) {

		return front.getName().compareTo(back.getName());
	
/**
 * 위의 파라미터에 있는 앞글자와 비교해서 
 * 앞글자가 먼저 나오는 글자라면 그 글자부터 리티해라	
 */
	
	}
}
