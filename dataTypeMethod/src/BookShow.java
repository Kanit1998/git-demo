import java.util.Arrays;

public class BookShow {
    //data members
    private String movieName;
    private String theater;
    private String city;
    private String[] seatNumbers;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String[] getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(String[] seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    @Override
    public String toString() {
        return "BookShow{" +
                "movieName='" + movieName + '\'' +
                ", theater='" + theater + '\'' +
                ", city='" + city + '\'' +
                ", seatNumbers=" + Arrays.toString(seatNumbers) +
                '}';
    }
}
