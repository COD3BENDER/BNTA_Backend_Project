package com.bnta.bnta_backend_api_project.components;

import com.bnta.bnta_backend_api_project.models.*;
import com.bnta.bnta_backend_api_project.repositories.CustomerRepository;
import com.bnta.bnta_backend_api_project.repositories.OrdersRepository;
import com.bnta.bnta_backend_api_project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrdersRepository ordersRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // CUSTOMER DATA LOADER

        List<Customer> customers = Arrays.asList(
              new Customer("cust1","email1","5678"),
                new Customer("cust2","email2","5678"),
                new Customer("cust3","email3","5678"),
                new Customer("cust4","email4","5678")
        );

        for (Customer customer : customers) {
            Customer customerName = new Customer(customer.getName(), customer.getEmail(), customer.getCardNumber());
            customerRepository.save(customerName);
        }

        // PRODUCTS DATA LOADER

        List<Book> books = Arrays.asList(
                new Book("JK Rowling","Harry",13,11,12,2001,500),
                new Book("JK Rowling","Harry Potter the cursed child 2",43,11,12,2001,500),
                new Book("JK Rowling","Harry Potter the cursed child 3",12,11,12,2001,500),
                new Book("JK Rowling","Harry Potter the cursed child 4",533,11,12,2001,500),
                new Book("Khalid Hosseini","A Thousand Splendid Suns",533,11,12,2001,500)
        );

        List<Movie> movies = Arrays.asList(
                new Movie("Francis","The Godfather",10,12,100,9.9,100),
                new Movie("Francis","The Godfather",10,12,100,9.9,100),
                new Movie("Francis","The Godfather",10,12,100,9.9,100),
                new Movie("Francis","The Godfather",10,12,100,9.9,100)

        );

        List<Music> songs = Arrays.asList(
                new Music("Outlandish", "Look into my eyes",10,12,200,"2000",200),
                new Music("Outlandish", "Look into my eyes",10,12,200,"2000",200),
                new Music("Outlandish", "Look into my eyes",10,12,200,"2000",200),
                new Music("Outlandish", "Look into my eyes",10,12,200,"2000",200)

        );


        for (Book book : books) {
            Book bookName = new Book(book.getCreator(),book.getTitle(),book.getPrice(),book.getCost(),book.getAvailableQuantity(),book.getYearOfPublication(),book.getNoOfPages());
            productRepository.save(bookName);
        }

        for (Movie movie : movies) {
            Movie movieName = new Movie(movie.getCreator(),movie.getTitle(),movie.getPrice(),movie.getCost(),movie.getAvailableQuantity(),movie.getRating(),movie.getRunTime());
            productRepository.save(movieName);
        }

        for (Music music : songs) {
            Music musicName = new Music(music.getCreator(),music.getTitle(),music.getPrice(),music.getCost(),music.getAvailableQuantity(),music.getDecade(),music.getSongLength());
            productRepository.save(musicName);
        }

    }
}
