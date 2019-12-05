package com.cursach.movie.doamin;

import com.cursach.movie.repos.Film_typesRepo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Film_types {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name_types;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy="film_types")
    private Set<Film> films;

    public Film_types() {
    }

      public Film_types(String name_types) {
        this.name_types = name_types;
    }


    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_types() {
        return name_types;
    }

    public void setName_types(String name_types) {
        this.name_types = name_types;
    }
}
