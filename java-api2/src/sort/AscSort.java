package sort;

import java.util.Arrays;
import java.util.Vector;
/**
 * @file_name : AscSort.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 1.
 * @Story	  : 오름차순 정렬(스왑) 방법
 */
public class AscSort {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		Vector<Integer> vec2 = new Vector<Integer>();
		int[] arr = {2,5,68,79,123,4,9};
		int temp = 0;
		System.out.println("============오름차순==========");
		Arrays.sort(arr); //오름차순 정렬 메소드
		
		for (int i : arr) {
			vec.add(i);
		}
		System.out.println(vec.toString());
		System.out.println("============내림차순==========");
		
		
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = 0; j < arr.length -1; j++) {
				if (arr[i]>arr[j]) {
					temp = arr[i]; // 스왑정렬
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			vec2.add(i);
		}
		System.out.println(vec2.toString());;
	}
}
