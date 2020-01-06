package com.knative.springmvc.services;

import com.knative.springmvc.models.Book;

import java.util.List;

/**
 * @author rajkumarj
 *
 */
public interface BookService {
	Book findById(Long id);

	Book findByName(String name);

	void saveOrUpdateBook(Book book);

	void deleteBookById(Long id);

	List<Book> findAllBooks();

	void deleteAllBooks();

	public boolean isBookExist(Book book);
}
