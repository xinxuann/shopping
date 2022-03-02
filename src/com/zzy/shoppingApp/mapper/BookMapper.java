package com.zzy.shoppingApp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zzy.shoppingApp.bean.Book;

public interface BookMapper {
	@Select("select * from ec_article_type")
	List<Book> findAllBooks();
}
