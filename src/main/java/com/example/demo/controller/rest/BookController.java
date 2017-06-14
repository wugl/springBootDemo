package com.example.demo.controller.rest;

import com.example.demo.bean.ReturnWithData;
import com.example.demo.domain.Book;
import com.example.demo.repository.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wgl on 6/14/17.
 */
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @RequestMapping("")
    public ReturnWithData<List<Book>> getAllBooks(){

        List<Book> data = bookDao.findAll();

        return new ReturnWithData<>("all books","OK",data);

    }
    @RequestMapping("/title/{title}")
    public ReturnWithData<List<Book>> findBookByTitle(@PathVariable String title){

        Book data = bookDao.findByTitle(title);

        return new ReturnWithData("find Book By Title","OK",data);

    }
    @RequestMapping("/id/{id}")
    public ReturnWithData<List<Book>> findBookById(@PathVariable Long id){

        Book data = bookDao.findByBookId(id);

        return new ReturnWithData("find Book By Id","OK",data);

    }
}
