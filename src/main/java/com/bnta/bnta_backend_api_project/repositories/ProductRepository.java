package com.bnta.bnta_backend_api_project.repositories;

import com.bnta.bnta_backend_api_project.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("from book")
    List<Book> findAllBook();
    @Query("from movie")
    List<Movie> findAllMovie();
    @Query("from music")
    List<Music> findAllMusic();

    @Query("from book")
    List<Book> findBookByTitle(String name);



}

