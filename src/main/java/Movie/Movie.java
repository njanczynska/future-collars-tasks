package Movie;

public class Movie {

    private final String title;
    private final String surnameOfFilmDirector;
    private final int duration;
    private final int yearOfProduction;

    public Movie(String title, String surnameOfFilmDirector, int duration, int yearOfProduction) {
        this.title = title;
        this.surnameOfFilmDirector = surnameOfFilmDirector;
        this.duration = duration;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public String getSurnameOfFilmDirector() {
        return surnameOfFilmDirector;
    }

    public int getDuration() {
        return duration;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
