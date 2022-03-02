package com.zzy.shoppingApp.service;

import java.util.List;

import com.zzy.shoppingApp.bean.Book;

public interface BookServiceI {

		/**
		 * 获取所有的书籍
		 * @return
		 */
		List<Book> getAllBook();
}
