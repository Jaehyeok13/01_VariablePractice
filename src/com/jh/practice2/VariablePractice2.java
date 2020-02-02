package com.jh.practice2;

import java.util.Scanner;

public class VariablePractice2 {
	public void run() {
		// 키보드로 정수 두개를 입력 받아 두수의 합,차,곱,나누기 한 몫을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		boolean key = false;
		int add = 0;
		int sub = 0;
		int mul = 0;
		int div = 0;
		
		
		
		while (key == false) {
			System.out.print("첫 번째 정수 : ");
			int firstNumber = sc.nextInt();

			System.out.print("두 번째 정수 : ");
			int secondnumber = sc.nextInt();

			if (firstNumber <= 0 || secondnumber <= 0) {
				System.out.println("입력 하신 숫자가 정수가 아닙니다. 다시 입력해주세요.");
			}else {
				add = firstNumber + secondnumber;
				sub = firstNumber - secondnumber;
				mul = firstNumber * secondnumber;
				div = firstNumber / secondnumber;
				
				System.out.println("더하기 결과 : " + add);
				System.out.println("빼기 결과 : " + sub);
				System.out.println("곱하기 결과 : " + mul);
				System.out.println("나누기 몫 결과 : " + div);
				
				key = true;
				sc.close();
			}
		}
	}
}