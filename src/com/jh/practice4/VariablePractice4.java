package com.jh.practice4;

import java.util.Scanner;

public class VariablePractice4 {
	public void run() {
		// 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String st = sc.next();
		
		System.out.println("첫 번째 문자 : " + st.charAt(0));
		System.out.println("두 번째 문자 : " + st.charAt(1));
		System.out.println("세 번째 문자 : " + st.charAt(2));
		
		sc.close();
	}
}
