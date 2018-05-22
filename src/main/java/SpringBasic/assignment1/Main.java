package SpringBasic.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringBasic.assignment1.modal.Movie;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applCtx = new ClassPathXmlApplicationContext("SpringConfigAssign1.xml");
		Movie movie1 = (Movie) applCtx.getBean("movie1");
		Movie movie2 = (Movie) applCtx.getBean("movie2");
		Movie movie3 = (Movie) applCtx.getBean("movie3");
		System.out.println("1->MovieId:"+movie1.getMovieId()+", MovieName:"+movie1.getMovieName()+", MovieActor:"+movie1.getMovieActor());
		System.out.println("2->MovieId:"+movie2.getMovieId()+", MovieName:"+movie2.getMovieName()+", MovieActor:"+movie2.getMovieActor());
		System.out.println("3->MovieId:"+movie3.getMovieId()+", MovieName:"+movie3.getMovieName()+", MovieActor:"+movie3.getMovieActor());
		
	}
}
