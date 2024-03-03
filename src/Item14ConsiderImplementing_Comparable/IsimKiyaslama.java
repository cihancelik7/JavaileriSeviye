package Item14ConsiderImplementing_Comparable;

import java.util.Comparator;

public class IsimKiyaslama implements Comparator<Kitap> {
    // comparator un compare dan farki su
    // burada iki adet obje aliyor aslinda olusturdugumuz iki farkli objenin kiyaslamasi yapiliyor
    @Override
    public int compare(Kitap o1, Kitap o2) {
        return o1.getIsim().compareTo(o2.getIsim());
    }
}
