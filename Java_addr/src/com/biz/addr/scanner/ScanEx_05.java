package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 >> ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 >> ");
		int num2 = scan.nextInt();
		System.out.printf("%d + %d = %d ", num1, num2, num1 + num2);

		/*
		 * InputStream의 문제로 인하여
		 * 숫자를 scan하는 nextInt() method를 수행한 후
		 * 곧바로 이어서 문자열을 scan하는 nextLine() method를 수행하면
		 * 내부 메커니즘 문제로 인하여 Buffer에 Enter코드가 남아있다가
		 * 곧바로 nextLine() method에게 전달되어버린다.
		 * 이때문에 nextInt()를 수행한 후 nextLine()를 수행하면
		 * 의도하지않게 코드가 진행된다.
		 * 
		 *  이 문제를 해결하기 위해
		 *  scanner를 통해 키보드 입력을 받기 위해서는 nextLine()만 사용하자.
		 *  그럼 숫자는?? >> ScanEx_06
		 */
		// 이렇게 되면 바로 문자열을 입력할 수가 없음.
		// 숫자를 입력받는 메서드하고
		// 문자열 입력받는 메서드를 하게되면 이런 오류가 자주 발생한다.
		// 컴퓨터가 내가 엔터를 쳤다고 생각하고 넘어가버리게 되는거임
		System.out.print("문자열 입력 >> ");
		String strInput = scan.nextLine();
		System.out.println("입력된 문자열 : " + strInput);

		scan.close();
	}
}
