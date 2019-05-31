package com.biz.for_each;

public class For_02 {

	public static void main(String[] args) {

		//for문 괄호안에 들어있는 선언문 
		//ex)for(int intEle = 2;intEle < 10;intEle++) {
		//는 for문 안에서만 적용된다.
		//해당되는 for문이 끝나는 순간 기억장치에서 사라진다.
		//이러한 for문 안에서 선언된 변수를 지역변수라 한다.
	    // 메인문 안에서는 적용이 되질 않아 다시 선언해주어야 한다.
		int intGu =2;
		System.out.println("=======" + intGu + "단" + "========");
		for(int intEle = 2;intEle < 10;intEle++) {
			System.out.println(intGu+"x"+ intEle+"="+intGu*intEle);
		}
		intGu++;
		
		//for문의 첫번째 문에는 선언문, 두번째는 반복조건을 비교문 마지막은 반복
		//하는 증감값을 넣어준다.
		for(int intEle = 2;intEle < 10;intEle++) {
			System.out.println(intGu+"x"+ intEle+"="+intGu*intEle);
			
	}
	}
}
