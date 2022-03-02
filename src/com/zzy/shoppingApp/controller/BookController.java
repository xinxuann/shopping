package com.zzy.shoppingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzy.shoppingApp.bean.Book;
import com.zzy.shoppingApp.service.BookServiceI;

@Controller
public class BookController {
	@Autowired
	private BookServiceI bookService;
	
	@ResponseBody
	@RequestMapping("/getAllBooks")
	public String getAllBooks() {
		List<Book> books = bookService.getAllBook();
		System.out.print("书籍的数量是"+books.size());
		return null;
	}
}
