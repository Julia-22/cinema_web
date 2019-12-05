package com.cursach.movie;

import com.cursach.movie.doamin.Film;
import com.cursach.movie.doamin.Film_types;
import com.cursach.movie.repos.FilmRepo;
import com.cursach.movie.repos.Film_typesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class ControllerMain {
    @Autowired
    private FilmRepo filmRepo;
    @Autowired
    private Film_typesRepo film_typesRepo;
    Film_types typeNew;

    @GetMapping("/admin")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Map<String, Object> model) {
        model.put("name", name);
        return "admin";
    }

    @GetMapping("/home")
    public String getTickets(Map<String,Object> model){
        Iterable<Film> films = filmRepo.findAll();
        model.put("films", films);
        return "home";
    }


    @PostMapping("admin/addFilm")
    public String post(@RequestParam  String name, @RequestParam String film_image,
                       @RequestParam Film_types film_types, @RequestParam String description,
                       @RequestParam String trailer_img, @RequestParam String running_time,
                       @RequestParam String release_date,
                       @RequestParam String original_title, @RequestParam String production,
                       @RequestParam int year_production,
                       @RequestParam String director, @RequestParam String cast,
                       @RequestParam String age_limit, @RequestParam String showing_in,
                       Map<String, Object> model){



        Film film = new Film(name,film_image,film_types,description,
                trailer_img,running_time,release_date,
                original_title, production, year_production,
                director, cast,age_limit, showing_in);

        filmRepo.save(film);

//        Iterable<Film> films = filmRepo.findAll();
//        model.put("films", films);

        return "home";
    }

}
