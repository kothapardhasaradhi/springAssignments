package SpringBasic.assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SpringBasic.assignment1.modal.Movie;

@Configuration
public class AppConfig {
	
	@Bean
	public Movie movie1(){
		Movie movie = new Movie();
		movie.setMovieId("M001");
		movie.setMovieName("The Firm");
		movie.setMovieActor("Tom Cruise");
		return movie;
	}
	@Bean
	public Movie movie2(){
		Movie movie = new Movie();
		movie.setMovieId("M002");
		movie.setMovieName("Avengers");
		movie.setMovieActor("Ironman");
		return movie;
	}
	@Bean
	public Movie movie3(){
		Movie movie = new Movie();
		movie.setMovieId("M003");
		movie.setMovieName("SpiderMan");
		movie.setMovieActor("Peter");
		return movie;
	}
}
