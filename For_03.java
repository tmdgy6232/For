package com.biz.for_each;

public class For_03 {

	public static void main(String[] args) {

		int intSum =0;
		int intE =1;
		intSum = intSum + intE ; //1
		
		intE++;
		intSum= intSum + intE; //1+2
		
		for(int i =1; i <= 10; i++) {
			//intSum = intSum+i;
			intSum += i;
		}
			System.out.println(intSum);
			
		int a=0;
		int d=0;
	
		for(a=2;a<11;a+=2) {
			System.out.println(a);
			d +=a;
		}
		System.out.println("짝수의합 :" + d);
		
		int b=0;
		int c=0;
		c=10%4;
		int e=0;
		
		
		for(b=1;b<=10;b+=c) {
			e+=b;
			
		}
		System.out.println("홀수의 합 :"+e);
			
		
		//멈추는 효과 주려고 사용
		for(int i=1; i<100; i++) {
			for(long j=1; j<100000000;j++);
			System.out.println(i);
		}
		
		
		
		
	}

}
