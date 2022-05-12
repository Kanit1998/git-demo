import java.util.Objects;

public class Movies {
    private int Id;
    private String Moviename;
    private String Directorname;
    private String Releasedate;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMoviename() {
        return Moviename;
    }

    public void setMoviename(String moviename) {
        Moviename = moviename;
    }

    public String getDirectorname() {
        return Directorname;
    }

    public void setDirectorname(String directorname) {
        Directorname = directorname;
    }

    public String getReleasedate() {
        return Releasedate;
    }

    public void setReleasedate(String releasedate) {
        Releasedate = releasedate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movies)) return false;
        Movies movies = (Movies) o;
        return Id == movies.Id && Objects.equals(Moviename, movies.Moviename) && Objects.equals(Directorname, movies.Directorname) && Objects.equals(Releasedate, movies.Releasedate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Moviename, Directorname, Releasedate);
    }

    @Override
    public String toString() {
        return "Movies{" +
                "Id=" + Id +
                ", Moviename='" + Moviename + '\'' +
                ", Directorname='" + Directorname + '\'' +
                ", Releasedate='" + Releasedate + '\'' +
                '}';
    }
}
