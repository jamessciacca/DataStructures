import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;

class Movie{

    private String title;
    private String genre;
    private int releaseYear;

    public Movie(String title, String genre, int releaseYear){
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public String toString(){
        return title + " (" + releaseYear + ") - " + genre;
    }
        
        public static void main(String[] args){

            List<Movie> movies = new ArrayList<>();
            movies.add(new Movie("The Shawshank Redemption", "Drama", 1994));
            movies.add(new Movie("The Godfather", "Crime", 1972));
            movies.add(new Movie("The Dark Knight", "Action", 2008));
            movies.add(new Movie("Forrest Gump", "Drama", 1994));
            movies.add(new Movie("Pulp Fiction", "Crime", 1994));

            //sort by release year in decenting order
            Comparator<Movie> releaseYearComparator = Comparator.comparing(Movie::getReleaseYear, Comparator.reverseOrder());
            //sort movies using comparator
            Collections.sort(movies, releaseYearComparator);
            System.out.println("Movies sorted by release year in descending order: ");
            
            for(Movie movie : movies){
                System.out.println(movie);
            }

            //use iterator to traverse sci-fi movies
            Iterator<Movie> sciFiIterator = movies.subList(0, 2).iterator();

            //while loop
            while(sciFiIterator.hasNext()){
                Movie sciFiMovie = sciFiIterator.next();
                System.out.println(sciFiMovie);
            }

            //for drama movies
            System.out.println("Drama movies: ");
            Iterator<Movie> dramaIterator = movies.subList(2, 4).iterator();
            while(dramaIterator.hasNext()){
                Movie dramaMovie = dramaIterator.next();
                System.out.println(dramaMovie);
            }
    }

}
