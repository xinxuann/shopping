package com.zzy.shoppingApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zzy.shoppingApp.bean.Book;
import com.zzy.shoppingApp.mapper.BookMapper;
import com.zzy.shoppingApp.service.BookServiceI;
@Service("bookService")
@Transactional
public class BookServiceImpl implements BookServiceI {
	@Autowired
	private BookMapper bookMapper;
	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookMapper.findAllBooks();
	}

}
