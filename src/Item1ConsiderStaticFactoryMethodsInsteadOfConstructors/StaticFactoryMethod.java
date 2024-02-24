package Item1ConsiderStaticFactoryMethodsInsteadOfConstructors;
/*
    On Soru:
     Neden Constructor yerine static factory method?
        1) Constructorlarda istediginiz ismi vermek gibi bir seceneginiz olmaz.
        2) Durmadan yeni instance urettigimizde cacheleme gibi bir mekanizma kurma sansimiz yok
        3) Constructorlar ile alt tipte ve ya farkli tipte bir obje uretemiyoruz

     Static Factory Method nedir?
        1) Boolean Ornegi

   Akis;
    1) String value of ve Boolean value of
    2) Constructorá karsi default parametre atama avantaji

   Ozet:
    1) static factory method ile isim secme ozelligi kazaniyoruz
    2) hangi instanceyi dondurecegimiz ile ilgili tum kontrolu elimize aliyoruz
    3) hangi tipte obje donecekse bunun kontrolunu de ele aliyoruz



 */
import java.util.Collections;
public class StaticFactoryMethod {

    public static void main(String[] args) {
        Yemek yemek = Yemek.sicakYemek("Kofte");
        System.out.println(yemek.name);
        yemek.name = "Patates";
        System.out.println(yemek.name);
    }




    Fenerbahce fener = new Fenerbahce("Mesut",22);
    Fenerbahce fener2 = new Fenerbahce("AliKoc",32);

    // Burada yenin futbolcu uretirken kullanici bir fonksiyon ile yasi otomatik sabitledi
    Fenerbahce yeniFutbolcuYasiOtomatik = Fenerbahce.yeniFutbolcuUret("Cihan");
}
