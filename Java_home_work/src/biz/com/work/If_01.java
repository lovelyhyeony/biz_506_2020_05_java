package biz.com.work;
/*
 * if문으로
 * int a = 30;
 * int b = 15;
 * int c = 20;
 * 
 * 출력에서
 * System.out.println(a + "<" + b + "<" +c);
 * 이 답이 15 <20 <30 
 */
public class If_01 {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 15;
		int c = 20;
		
		int temp = 0;
		if (a > b) {
			temp = a;
			a = b;
			b = temp ;
			
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println("------------");
		int temp1 = 0; 
		if (b > c) {
			temp1 = b;
			b = c;
			c = temp1;
			System.out.println(b);
			System.out.println(c);
		}
		System.out.println("------------");
		
		System.out.println(a + "<" + b + "<" +c);
		
		
	}
}
