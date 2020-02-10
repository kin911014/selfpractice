package ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
//		String[] names = { "AAA~", "BBB~", "COOL", "똠방각하" };
//
//		String str = Arrays.toString(names);
//
//		System.out.println(str);

		char [] charArray1 = { 'a', 'b', 'c' };
		String [] charArray2 = {"aa", "bb", "cc"};
		int[] intArray1 = { 1, 2, 3 }; // char 배열을 String으로 변환 String str1 = String.valueOf(charArray1);

		
		String str1 = String.valueOf(charArray1);
		String str2 = String.valueOf(charArray2);

		System.out.println(arrayJoin(" ", charArray2));
		
		System.out.println(Arrays.toString(charArray1));
		System.out.println(Arrays.toString(charArray2));
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

//		    // 원본 배열 출력
//		    System.out.println(Arrays.toString(names));
//		    System.out.println(names);
//		 
//		 // 배열을 리스트로 변환
//		    List<String> list = Arrays.asList(names);
//		    System.out.println(list);
//		    Collections.reverse(list);
//		    names = list.toArray(new String[list.size()]);
//		    String s = Arrays.toString(names);
//		    System.out.println(s);
	}

}
