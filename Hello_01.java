package com.biz.for_each;
//패키지에서 클래스를 만들면 경로를 확인하기위해 삽입된다.
// 이것을 지우면 코드는 길잃은 미아가 된다.

public class Hello_01 {

	public static void main(String[] args) {

		
		int intGu =2;
		int intEle =1;
		//반복문
		// for는 자기가 감싸고있는 코드를 반복적으로 실행하는 명령문
		// for안의 
		for(;intEle < 10;) {
			System.out.println("반복");
			System.out.println(intGu+"x"+ ++intEle+"="+intGu*intEle);
			
		}
			
	}

}
