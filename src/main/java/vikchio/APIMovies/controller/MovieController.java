package vikchio.APIMovies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vikchio.APIMovies.model.Movie;
import vikchio.APIMovies.service.MovieService;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> findAll() {
        return movieService.findAll();
    }

    @GetMapping("/movie/{id}")
    public Movie findById(@PathVariable String id) {
        return movieService.findById(id).get();
    }

    @GetMapping("/movie/bytitle/{title}")
    public List<Movie> findByTitle(@PathVariable String title) {
        return movieService.findByTitle(title);
    }

    @GetMapping("/movie/byyear/{year}")
    public List<Movie> findByYear(@PathVariable Long year) {
        return movieService.findByYear(year);
    }
}
