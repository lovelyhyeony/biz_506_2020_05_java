package com.biz.book.domain;
/*
 * 객체 추상화
 * 다음과 같은 BookVO 생성
 * 도서명 : title, "자바의 정석"
 * 출판사 : comp, "도우출판"
 * 저자 : writer, "남궁성"
 * 출판연도 : year, "2016"
 * 가격 : price, 30000
 * 
 * **각 필드의 type?**
 * 변수는 private
 * getter, setter method 설정.
 */
/*
 * 도서 정보를 저장할 VO 클래스
 * 도서명, 출판사, 저자, 출판연도, 가격 필드 포함
 * 출판연도는 나중에 4칙연산을 수행할 것을 예상하여 int형으로 선언
 */
public class BookVO {

	private String title;
	private String comp;
	private String writer;
	private int year;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
