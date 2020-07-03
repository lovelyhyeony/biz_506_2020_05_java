package com.biz.book.domain;

import com.biz.book.service.BookService;
import com.biz.book.service.BookServiceImplV1;

public class BookEx_01 {

	public static void main(String[] args) {
		
		// 인터페이스가 있는 친구는 BookService bService로  
		BookService bService = new BookServiceImplV1();
		
		while(true) {
			
			if(!bService.inputBook()) {
				break;
			}
		}
		bService.booklist();
	}
}
