package movies;

import java.util.*;

public class MovieListApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userContinue = "y";


		ArrayList<Movie> moviesTitles = new ArrayList<>();
		moviesTitles.add(new Movie("Forrest Gump", "drama"));
		moviesTitles.add(new Movie("Gladiator", "drama"));
		moviesTitles.add(new Movie("Schindler List", "drama"));
		
		moviesTitles.add(new Movie("Halloween", "horror"));
		moviesTitles.add(new Movie("The Exorcist", "horror"));
		moviesTitles.add(new Movie("The Witch", "horror"));
		
		moviesTitles.add(new Movie("E.T. ", "scifi"));
		moviesTitles.add(new Movie("Star Wars", "scifi"));
		moviesTitles.add(new Movie("The Matrix", "scifi"));
		
		moviesTitles.add(new Movie("Coco", "animated"));
		moviesTitles.add(new Movie("Finding Nemo", "animated"));
		moviesTitles.add(new Movie("Toy Story", "animated"));
		
		
		System.out.println("Welcome to The Movie List Application!\n\n" );
		System.out.println("There are 12 movies in this list\n" );

		do {
			System.out.println("What category are you interested in?" );
			System.out.println("animated, drama, horror, scifi");
			String category = scnr.next();
			
			if(category.equals("animated") || category.equals("drama") || category.equals("horror")|| category.equals("scifi")) {
				for(int i=0; i<moviesTitles.size(); ++i) {
					
					if (moviesTitles.get(i).getCategory().equals(category)) {
						System.out.println(moviesTitles.get(i).getTitle());
					} 
				}//end for
			
			}//end if
			else {
				System.out.println("Sorry we don't have that category");
			}

			System.out.println("Would you like to continue? (y/n)");
			userContinue = scnr.next();
		}//end do
		while(userContinue.equals("y") || userContinue.equals("Y"));
		System.out.println("Thank you, Bye!");
		scnr.close();
	}//end main
}//end MovieListApp