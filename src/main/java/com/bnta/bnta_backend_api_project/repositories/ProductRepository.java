package com.bnta.bnta_backend_api_project.repositories;

import com.bnta.bnta_backend_api_project.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

    @Query(value = "SELECT * FROM product WHERE media_type = 'book' AND title LIKE %?1%", nativeQuery = true)
    List<Book> findBookByTitle(String title);

    @Query(value = "SELECT * FROM product WHERE media_type = 'music' AND title LIKE %?1%", nativeQuery = true)
    List<Music> findMusicByTitle(String title);

    @Query(value = "SELECT * FROM product WHERE media_type = 'movie' AND title LIKE %?1%", nativeQuery = true)
    List<Movie> findMovieByTitle(String title);




}


