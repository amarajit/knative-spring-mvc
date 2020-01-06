package com.knative.springmvc.services;


import com.knative.springmvc.models.Book;
import com.knative.springmvc.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author rajkumarj
 *
 */
@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book findById(Long id) {
		return bookRepository.findBookByBookid(id);
	}

	@Override
	public Book findByName(String name) {
		return bookRepository.findBookByBookname(name);
	}

	@Override
	public void saveOrUpdateBook(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteBookByBookid(id);
	}

	@Override
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public void deleteAllBooks() {
		bookRepository.deleteAll();
	}

	@Override
	public boolean isBookExist(Book book) {
		return bookRepository.existsBookByBookid(book.getBookid());
	}
}
