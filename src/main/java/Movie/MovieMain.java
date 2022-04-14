package Movie;

public class MovieMain {
    public static void main(String[] args) {

        Movie movie = new Movie("Challenge", "John Smith", 160, 2020);
        System.out.println(movie.getTitle());
        System.out.println(movie.getSurnameOfFilmDirector());
        System.out.println(movie.getDuration());
        System.out.println(movie.getYearOfProduction());
    }
}
