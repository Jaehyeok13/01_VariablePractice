package com.jh.practice3;

import java.util.Scanner;

public class VariablePractice3 {
	public void run() {
		// 키보드로 가로,세로 값을실수형으로 입력 받아 사각형의 면적과 둘레를 계산하 출력 하세.
		// 계산 공식 ) 면적 : 가로 * 세로
		//			 둘레 : (가로 + 세로) * 2
		
		Scanner sc = new Scanner(System.in);
		double area = 0;
		double circumference = 0;
		
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		area = width * height;
		circumference = (width + height) * 2;
	
		System.out.println("면적 : " + area );
		System.out.println("둘레 : " + circumference);
		sc.close();
		
	}
}
