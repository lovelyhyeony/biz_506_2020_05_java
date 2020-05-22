package com.biz.hello;

public class Var_04 {
	
	public static void main(String[] args) {
		
		// ++로 일일이 숫자를 적어주지 않아도 된다는 
		int sum = 0;
		int num = 7;
		
		sum = sum + num; //num : 0
		sum = sum + ++num; //num : 1
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		
		
		System.out.printf("1 부터 %d 까지의 덧셈 : %d\n",num,sum);
		
		
	}

}
