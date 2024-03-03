package Item14ConsiderImplementing_Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Item14Test {
    public static void main(String[] args) {
        ArrayList<Kitap> kitapListesi = new ArrayList<Kitap>();
        kitapListesi.add(new Kitap("Satranc",120));
        kitapListesi.add(new Kitap("Genc werther'in acilari",200));

        Collections.sort(kitapListesi);
        // burada aslinda sort icerisinde ben nasil siralanmasi gerektigini vermis oluyorum
        System.out.println("Siralama1:");
        // bu compare ile sayfa siralamasi yapildi
        for (Kitap kitap : kitapListesi){
            System.out.println(kitap.toString());
        }
        System.out.println();
        //Siralama2
        System.out.println("Siralama2: ");
        // burada ise comparator ile isim siralamasi yapildi.
        IsimKiyaslama ismeGore = new IsimKiyaslama();
        Collections.sort(kitapListesi,ismeGore);
        for (Kitap kitap : kitapListesi){
            System.out.println(kitap.toString());
        }

        /*
         farkli objelerin hic degismeyecek sadece sayfaya gore kiyaslama yapmak istiyorsak evet, direkt compare to methodunu kullaniriz
         fakat birden cok methodla siralama yapacaksak ornegin tarih adres fiyat isim gibi... bu durumlarda comparable methodunu kullanabiliriz

         */
    }
}
