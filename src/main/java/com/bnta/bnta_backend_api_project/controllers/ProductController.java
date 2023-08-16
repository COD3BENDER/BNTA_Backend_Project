package com.bnta.bnta_backend_api_project.controllers;

import com.bnta.bnta_backend_api_project.models.Book;
import com.bnta.bnta_backend_api_project.models.Movie;
import com.bnta.bnta_backend_api_project.models.Music;
import com.bnta.bnta_backend_api_project.models.Product;
import com.bnta.bnta_backend_api_project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping({"/products"})
public class ProductController {

    @Autowired
    ProductService productService;

//    INDEX

    @GetMapping({"/all"})
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.FOUND);
    }

    @GetMapping({"/books"})
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = productService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.FOUND);
    }

    @GetMapping({"/movies"})
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = productService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.FOUND);
    }

    @GetMapping({"/songs"})
    public ResponseEntity<List<Music>> getAllSongs() {
        List<Music> songs = productService.getAllSongs();
        return new ResponseEntity<>(songs, HttpStatus.FOUND);
    }



    @GetMapping("/books/{title}")
    public ResponseEntity <List<Book>> getBookByTitle(@PathVariable String title) {
        List<Book> books = productService.getBookByTitle(title);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/songs/{title}")
    public ResponseEntity <List<Music>> getMusicByTitle(@PathVariable String title) {
        List<Music> songs = productService.getMusicByTitle(title);
        return new ResponseEntity<>(songs, HttpStatus.OK);
    }

    @GetMapping("/movie/{title}")
    public ResponseEntity <List<Movie>> getMovieByTitle(@PathVariable String title) {
        List<Movie> movies = productService.getMovieByTitle(title);
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @PostMapping

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
