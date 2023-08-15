package com.bnta.bnta_backend_api_project.controllers;

import com.bnta.bnta_backend_api_project.models.Product;
import com.bnta.bnta_backend_api_project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/products"})
public class ProductController {

    @Autowired
    ProductService productService;

//    INDEX
//
//    @GetMapping
//    public ResponseEntity<List<Book>> getAllBooks(){
//        return new ResponseEntity(this.bookService.findAllBooks(), HttpStatus.FOUND);
//    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllBooks() {
        List<Product> books = productService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }


//    SHOW

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Optional<Book>> getBook(@PathVariable Long id) {
//        return new ResponseEntity(bookService.findBook(id), HttpStatus.FOUND);
//    } // Check if we need to pull out data from product as opposed to book
//
////    CREATE
//
//    @PostMapping
//    public ResponseEntity<Customer> postCustomer(@RequestBody BookDTO bookDTO) {
//        bookService.addBook(bookDTO);
//        return new ResponseEntity(bookService.findAllBooks(), HttpStatus.CREATED);
//    }
//
////    UPDATE
//
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<Book> updateBook(@RequestBody BookDTO bookDTO, @PathVariable Long id) {
//        Book updateBook = bookService.updateBook(bookDTO, id);
//        return new ResponseEntity(updateBook, HttpStatus.OK);
//    }
//
////    DELETE
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Long> deleteBook(@PathVariable Long id) {
//        bookService.deleteBook(id);
//        return new ResponseEntity<>(id, HttpStatus.OK);
//    }




}