package com.knative.springmvc.repos;

import com.knative.springmvc.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findBookByBookid(Long id);

    Book findBookByBookname(String name);

    void deleteBookByBookid(Long id);

    boolean existsBookByBookid(Long id);
}
