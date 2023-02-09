package vikchio.APIMovies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vikchio.APIMovies.model.Movie;
import vikchio.APIMovies.repository.MovieRepository;

@Service
public class MovieServiceImp implements MovieService{
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> findById(String id) {
        return movieRepository.findById(id);
    }

    @Override
    public List<Movie> findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    @Override
    public List<Movie> findByYear(Long year) {
        return movieRepository.findByYear(year);
    }
}
