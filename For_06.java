package com.biz.for_each;

public class For_06 {

	public static void main(String[] args) {

		/*여러줄의 주석
		 * 작성가능한
		 * 아이템
		 * 개꿀~~
		 * intMin 부터, intMax 까지의
		 * 1. 전체합
		 * 2. 짝수의 합
		 * 3. 홀수의 합
		 * 을 노트에 작성
		 *  
		 */
		int intMin = 1;
		int intMax = 10;
		int p = 0;
		
		for(int i = intMin; i<=intMax; i++) {
			p+=i;
		}
		System.out.println("전체합 : "+p);
		
		p=0;
		
		for(int i = intMin%2; i<=intMax; i+=2) {
			p+=i;
			
		}
		System.out.println("홀수합 : "+p);
		p=0;
	
		for(int i = intMin+1; i<=intMax; i+=2) {
			p+=i;
		}
		System.out.println("짝수합 : "+p);
		
		
		int intEvenSum = 0;
		int intOddSum = 0;
		
		//짝수의 시작값 계산
		int intEven = intMin + intMin%2;
		for(int i = intEven; i<=intMax;i+=2) {
		intEvenSum +=i;	
		}
		
		//홀수의 시작값 계산
		intMin=1;
		
		int intOdd = intMin +(intMin+1)%2;
		for(int i = intOdd; i<=intMax;i+=2) {
			intOddSum +=i;
			
		}
		System.out.println("전체합:" + p);
		System.out.println("짝수합:" + intEvenSum);
		System.out.println("홀수합:" + intOddSum);

		
	}

}
