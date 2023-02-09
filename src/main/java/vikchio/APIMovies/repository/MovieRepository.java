package vikchio.APIMovies.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import vikchio.APIMovies.model.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    @Query(value = "{title:?0}")
    List<Movie> findByTitle(String title);

    @Query(value = "{year:?0}")
    List<Movie> findByYear(Long year);
}
