import java.util.LinkedList;

public class MoviesLinkedList {


    public static void moviesDetails(){

        LinkedList<Movies> moviesList= new LinkedList<>();
        Movies m1=new Movies();
        m1.setId(1);
        m1.setMoviename("KGF");
        m1.setDirectorname("Rama");
        m1.setReleasedate("7March");
        moviesList.add(m1);

        Movies m2=new Movies();
        m2.setId(2);
        m2.setMoviename("Tarzen");
        m2.setDirectorname("Petas");
        m2.setReleasedate("10April");
        moviesList.add(m2);

        System.out.println(moviesList);
    }

    public static void main(String[] args) {
        moviesDetails();

    }
}
