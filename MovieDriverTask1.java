import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		String tryAgain;
		
		Movie myMovie = new Movie();
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the name of a movie");
		myMovie.setTitle(keyboard.nextLine());
		
		System.out.println("Enter the rating of the movie");
		myMovie.setRating(keyboard.nextLine());
				
		System.out.println("Enter the number of tickets sold for this movie");
		myMovie.setSoldTickets(keyboard.nextInt());
		
		System.out.println(myMovie.toString());

		keyboard.close();
	}
}