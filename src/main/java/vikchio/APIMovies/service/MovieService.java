package vikchio.APIMovies.service;

import java.util.List;
import java.util.Optional;

import vikchio.APIMovies.model.Movie;

public interface MovieService {
    public List<Movie> findAll();

    public Optional<Movie> findById(String id);

    public List<Movie> findByTitle(String title);

    public List<Movie> findByYear(Long year);
}
