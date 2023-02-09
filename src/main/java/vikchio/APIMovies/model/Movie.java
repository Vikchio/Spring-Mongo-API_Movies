package vikchio.APIMovies.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "movies")
@Data
public class Movie {
    @Id
    private String id;
    private String title;
    private String year;
    private String plot;
    private Integer runtime;
    private String rated;
    private List<String> cast;
    private String poster;
    private List<String> languages;
    private List<String> directors;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPlot() {
        return this.plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Integer getRuntime() {
        return this.runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getRated() {
        return this.rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public List<String> getCast() {
        return this.cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public String getPoster() {
        return this.poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<String> getLanguages() {
        return this.languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getDirectors() {
        return this.directors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", title='" + getTitle() + "'" +
                ", year='" + getYear() + "'" +
                ", plot='" + getPlot() + "'" +
                ", runtime='" + getRuntime() + "'" +
                ", rated='" + getRated() + "'" +
                ", cast='" + getCast() + "'" +
                ", poster='" + getPoster() + "'" +
                ", languages='" + getLanguages() + "'" +
                ", directors='" + getDirectors() + "'" +
                "}";
    }

}
