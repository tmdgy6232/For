package com.biz.for_each;

public class For_01 {

	public static void main(String[] args) {

		
		int intGu =2;
		int intEle =1;
		//반복문
		// for는 자기가 감싸고있는 코드를 반복적으로 실행하는 명령문
		// for안의 세미콜론 사이의 첫 조건부터 실행하고, FOR문이 감싸고있는
		// 코드 내부의 코드를 실행한 다음, 마지막에 intEle++을 실행한다.
		// for문은 특징이 감싸고있는 코드를 몇번 반복할 지 조건을 설정할 수 있다.
		// 반복조건은 불린기호, ++등을 사용해 설정할 수 있다.
		System.out.println("++");
		for(;intEle <= 10;intEle++) {
			//System.out.println("반복");
			System.out.println(intGu+"x"+ intEle+"="+intGu*intEle);
		}
		
		intEle =1;
		
		System.out.println("+=2");

			for(;intEle <= 10;intEle+=2) {
				//System.out.println("반복");
				System.out.println(intGu+"x"+ intEle+"="+intGu*intEle);
			
		}
	}

}
