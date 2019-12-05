package com.cursach.movie.doamin;

import javax.persistence.*;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String film_image;
//    private int film_types_id;
    private String description;
    private String trailer_img;
    private String running_time;
    private String release_date;
    private String original_title;
    private String production;
    private int year_production;
    private String director;
    private String cast;
    private String age_limit;
    private String showing_in;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="film_types_id", nullable=false)
    private Film_types film_types;

    public Film() {
    }

    public Film(String name, String film_image, Film_types film_types, String description,
                String trailer_img, String running_time, String release_date,
                String original_title, String production, int year_production,
                String director, String cast, String age_limit, String showing_in) {
        this.name = name;
        this.film_image = film_image;
        this.film_types = film_types;
        this.description = description;
        this.trailer_img = trailer_img;
        this.running_time = running_time;
        this.release_date = release_date;
        this.original_title = original_title;
        this.production = production;
        this.year_production = year_production;
        this.director = director;
        this.cast = cast;
        this.age_limit = age_limit;
        this.showing_in = showing_in;
    }



    public String getFilm_image() {
        return film_image;
    }

    public void setFilm_image(String film_image) {
        this.film_image = film_image;
    }

    public Film_types getFilm_types() {
        return film_types;
    }

    public void setFilm_types(Film_types film_types) {
        this.film_types = film_types;
    }

    public String getTrailer_img() {
        return trailer_img;
    }

    public void setTrailer_img(String trailer_img) {
        this.trailer_img = trailer_img;
    }

    public String getRunning_time() {
        return running_time;
    }

    public void setRunning_time(String running_time) {
        this.running_time = running_time;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getYear_production() {
        return year_production;
    }

    public void setYear_production(int year_production) {
        this.year_production = year_production;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getAge_limit() {
        return age_limit;
    }

    public void setAge_limit(String age_limit) {
        this.age_limit = age_limit;
    }

    public String getShowing_in() {
        return showing_in;
    }

    public void setShowing_in(String showing_in) {
        this.showing_in = showing_in;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}