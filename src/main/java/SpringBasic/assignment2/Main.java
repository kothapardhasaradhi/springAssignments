package SpringBasic.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import SpringBasic.assignment1.modal.Movie;
public class Main {
	public static void main(String[] args) {
		ApplicationContext applCtx = new AnnotationConfigApplicationContext("AppConfig.class");
		Movie movie1 =  applCtx.getBean("movie1",Movie.class);
		Movie movie2 =  applCtx.getBean("movie2",Movie.class);
		Movie movie3 =  applCtx.getBean("movie3",Movie.class);
		System.out.println("1->MovieId:"+movie1.getMovieId()+", MovieName:"+movie1.getMovieName()+", MovieActor:"+movie1.getMovieActor());
		System.out.println("2->MovieId:"+movie2.getMovieId()+", MovieName:"+movie2.getMovieName()+", MovieActor:"+movie2.getMovieActor());
		System.out.println("3->MovieId:"+movie3.getMovieId()+", MovieName:"+movie3.getMovieName()+", MovieActor:"+movie3.getMovieActor());
		
	}
}
