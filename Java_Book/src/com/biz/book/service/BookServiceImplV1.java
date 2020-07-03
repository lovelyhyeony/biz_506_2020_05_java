package com.biz.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.book.domain.BookVO;

/*
 * BookService interface를 implements하여 작성
 * 구체적인 method의 코드를 작성해야한다
 * 
 * interface를 implements하면 interface에 정의된 method를
 * 모두 Ovveride하여 구현해야하는 규칙이 적용이 된다.
 * 
 * implements를 수행한 다음에는 반드시
 * add unimplemented method를 실행하여야한다.
 */
public class BookServiceImplV1 implements BookService {

	// List필드변수 선언
	List<BookVO> bookList;

	public BookServiceImplV1() {

		// 기본생성자 안에 필드변수에 생성자 초기화 하는 코드
		bookList = new ArrayList<BookVO>();

	} // >>>>>>>>>> BookServiceImplV1 method 종료 :] <<<<<<<<<<

	@Override
	public boolean inputBook() {
		// inputBook() method내에서만 Scanner를 사용하게 될 것으로 예상되므로
		// 필드변수에 선언하지 않고 method의 지역변수로 선언, 초기화를 수행
		// method의 지역변수로 선언을 하면 inputBooke() method의 수행이 끝나면
		// 변수가 자동으로 해제되는 효과를 낼 수 있다.
		Scanner scan = new Scanner(System.in);

		// BookVO bVO 선언해주면서 초기화 하는 코드
		BookVO bVO = new BookVO();

		// 도서명 입력하면서 scan의 nextLine메서드 호출해서 strTitle에 저장,보관
		System.out.print("도서명(입력종료 : END) >> ");
		String strTitle = scan.nextLine();

		// 만약 이 메서드를 호출한 곳에서 strTitle의 값이 END와 같다면
		// false를 반환하는 코드
		// 사용자가 도서명에 END를 입력하면 더이상 입력을 하지 않겠다라는
		// 신호를 호출한 곳에 return
		if (strTitle.equals("END")) {
			return false;
		}
		bVO.setTitle(strTitle); // bVO에 값 setting

		// 출판사 입력하면서 scan의 nextLine메서드 호출해서 strComp에 저장,보관
		System.out.print("출판사 >> ");
		String strComp = scan.nextLine();

		bVO.setComp(strComp);

		// 저자 입력하면서 scan의 nextLine메서드 호출해서 strWriter에 저장,보관
		System.out.print("저자 >> ");
		String strWriter = scan.nextLine();

		bVO.setWriter(strWriter);

		// 출판연도 입력하면서 scan의 nextLine메서드 호출해서 strYear에 저장,보관
		System.out.print("출판연도 >> ");
		String strYear = scan.nextLine();
		// VO에서 출판연도 필드변수를 int로 지정했기 때문에
		// 입력받은 문자열을 숫자로 바꿀 필요가 있다.

		int intYear = 0;
		try {
			intYear = Integer.valueOf(strYear);
		} catch (Exception e) {
			/*
			 * 만약 연도를 문자열로 잘못 입력해서 오류가 발생할 경우
			 * 현재 입력하고 있는 도서정보를 도서명부터 다시 입력하도록
			 */
			System.out.println("연도는 숫자만 입력 가능! 0으로 임시 저장 합니다 :(");
			// 어떻게 적은지 다시 보여주고 안내문을 보내는 것임.
			System.out.println(bVO.getTitle() + "도서명부터 다시 입력해주세요 :(");
			return true; // 출판 연도를 문자열로 잘못 썼을 때 도서명부터 다시 입력하게 하려면
			// return값을 true로 보내라
			// return을 하면 List추가가 되지않기때문에 다시 입력하라고 안내문을 잘 보내줘야한다.
		}

		bVO.setYear(intYear);

		System.out.print("가격 >> ");
		String strPrice = scan.nextLine();

		int intPrice = 0;
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			System.out.println("가격은 숫자만 입력 가능! 0으로 임시 저장 합니다 :(");
			System.out.println(bVO.getTitle() + "도서명부터 다시 입력해주세요 :(");
			return true;
		}
		
		/*
		 * bookList.add(bookVO) 코드가 실행되기전에
		 * return true를 수행하면
		 * 현재 method가 실행되면서 입력했던 도서정보(도서명, 출판사 등)들이
		 * 
		 * 아직 List에 추가되기 전이므로 현재의 입력된 정보는 모두 무시되어버린다.
		 * main에서는 true가 return 되었으므로
		 * 아무런 판단없이 다시 입력을 수행하는 inputBook() method를
		 * 호출하게 될 것이고, 
		 * 
		 * return하기전에 현재 도서를 다시 입력하라는 메시지를
		 * 보여주었으므로 입력하는 사용자는 당연히 현재 입력하던 도서를
		 * 다시 입력하게 될 것이다.
		 */

		bVO.setPrice(intPrice);

		bookList.add(bVO); // 입력 받은 값들 List에 추가하는 코드

		// 모든 항목이 입력이 완료되고 다음 도서정보를 입력받겠다
		// 라는 신호를 호출한 곳에 return(알림)
		return true;
	} // >>>>>>>>>> inputBook() method 종료 :] <<<<<<<<<<

	@Override
	public void booklist() {

		System.out.println("======================================================");
		System.out.println("도서 관리");
		System.out.println("======================================================");
		System.out.println("도서명\t출판사\t저자\t출판연도\t가격");
		System.out.println("------------------------------------------------------");

		int size = bookList.size();
		for (int i = 0; i < size; i++) {
			BookVO bVO = bookList.get(i);

			System.out.print(bVO.getTitle() + "\t");
			System.out.print(bVO.getComp() + "\t");
			System.out.print(bVO.getWriter() + "\t");
			System.out.print(bVO.getYear() + "\t");
			System.out.println(bVO.getPrice());

		}
		System.out.println("======================================================");
	} // >>>>>>>>>> bookList() method 종료 :] <<<<<<<<<<

}
