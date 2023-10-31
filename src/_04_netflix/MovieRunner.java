package _04_netflix;

public class MovieRunner {

	public static void main(String[] args) {
		Movie movie1 = new Movie("Terminator", 1000);
		Movie movie2 = new Movie("Zoolander", -1000);
		Movie movie3 = new Movie("Joe Black", 11);
		Movie movie4 = new Movie("As Good As It Gets", 900);
		Movie movie5 = new Movie("Christmas Chronicles", 11111);
		
		movie1.getTicketPrice();
		movie2.getTicketPrice();
		movie3.getTicketPrice();
		movie4.getTicketPrice();
		movie5.getTicketPrice();
		
		NetflixQueue que = new NetflixQueue();
		
		que.addMovie(movie1);
		que.addMovie(movie2);
		que.addMovie(movie3);
		que.addMovie(movie4);
		que.addMovie(movie5);
		
		que.printMovies();
		
		
		
		System.out.println("the best movie is.... " + que.getBestMovie(0));
		System.out.println("the second best movie is.... " + que.getBestMovie(1));

	}

}
