package com.biz.for_each;

public class For_04 {
	public static void main(String[] args) {
		int intf = 100;
		int intfs = 1;
		
		for(int i = 100; i > 0; i--) {
			System.out.println(i);
			//이항연산자 intfs * intfs*i
		 intfs *= i;
		 
		}
		
		int a = 2;
		int b =3;
		
		System.out.println(a*=b);
				
	}

}
