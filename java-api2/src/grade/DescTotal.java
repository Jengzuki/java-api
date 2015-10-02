package grade;

import java.util.Comparator;
import java.util.Vector;

public class DescTotal implements Comparator<Grade> {

	
	@Override
	public int compare(Grade front, Grade back) {
		
		
		return front.getTotal() > back.getTotal() ? -1 : front.getTotal() < back.getTotal()? 1:0;
		
		
		/**
		 * 삼항 연산자
		 * (컨디션) ? -1 :(거짓이라면 다시 컨디션을 주고) ? true : false;
		 * if(){
		 * } else {
		 * 		if(){
		 * 		  }else{
		 * 
		 *  }
		 */
	}

}
