package com.cursach.movie.repos;

import com.cursach.movie.doamin.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepo extends CrudRepository<Film, Integer> {

}