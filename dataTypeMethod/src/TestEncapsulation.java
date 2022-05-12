public class TestEncapsulation {
    public static void main (String[] args){
BookShow bookShow=new BookShow();
bookShow.setMovieName("KGF2");
bookShow.setTheater("bbmb");
bookShow.setCity("mandi");
String[] seatNumber={"a1","A4"};
bookShow.setSeatNumbers(seatNumber);
System.out.println(bookShow);
    }
}
