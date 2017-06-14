package com.example.demo.repository;
import com.example.demo.domain.Book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by qianlong on 16/9/27.
 */
public interface BookDao extends JpaRepository<Book,Long> {

    Book findByTitle(String title);

    Book findByBookId(Long id);

    Book findByTitleAndAuthor(String title, String author);

    @Query("from Book b where b.title=:title")
    Book findBook(@Param("title") String bookTitle);

    @Query("select book from Book book where book.author = :author")
    Page findBookPage(Pageable pageable, @Param("author") String author);
}