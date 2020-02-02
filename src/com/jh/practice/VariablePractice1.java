package com.jh.practice;

import java.util.Scanner;

public class VariablePractice1 {
	public void Run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요 (남/여) : ");
		char sex = sc.nextLine().charAt(0);
		String gender = "";
		if(sex == '남') {
			gender = "남자";
		}else if(sex == '여') {
			gender = "여자";
		}else {
			gender = "혼종";
		}
		
		System.out.print("나이를 입력하세요 ㅇ: ");
		int age = Integer.parseInt(sc.next());
		
		System.out.print("키를 입력하세요 (cm) : ");
		double height = sc.nextDouble();
		
		System.out.printf("키 %.1fcm 인 %d 살 %s %s님 반갑습니다. ^&^ ", height, age, gender, name);
		sc.close();
	}
}
