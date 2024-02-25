package Item5PreferDependencyInjectionToHardwiringResources;

import java.util.function.Supplier;

public class Item5Test {
    public static void main(String[] args) {

        // sadece turkce icin calisacak esneklik yok. Utility elenir.
        YaziAnaliziUtility.isValid();

        // cok uzun duruyor method adindan dolayi
        YaziAnaliziUtility.upuzunBirMetHodYaziyorumBununAmaciniBirazdanAsagidaAnlatacagim();

        // burada supplier kullanrak cozeriz
        Supplier<String > dahaKisa = () -> YaziAnaliziUtility.upuzunBirMetHodYaziyorumBununAmaciniBirazdanAsagidaAnlatacagim();
        // boylelikle daha kisa kod yazdirir
        dahaKisa.get();




        // burada da singleton mantiksiz kaliyor cunku cesitlemeye gitmiyor istenilen esnekligi kazanamiyoruz
        YaziAnaliziSingleton.INSTANCE.isValid();


        // burada esneklik kazandi ve icerigi burada belirliyoruz, ing yazarsak ing , turkce yazarsak turkce
      //  YaziAnaliziDependencyInjection asd = new YaziAnaliziDependencyInjection( new Sozluk("Turkce"));


        // Lambda ile gelen supplier kullanimi da var onu da asagida gosterelim.
        // Bir nevi Alternatif

        // LAMBDA FUCTION
        Supplier<String> cc = () -> "Cihan";
        cc.get(); // Cihan

        // new turkce sozluk demek yerine
        Supplier<Sozluk> sozlukSupplier = () -> new Sozluk("English");



        // Supplier bir baska iyi yonu->
        double randomSayi = Math.random();
        System.out.println(randomSayi);
        System.out.println(randomSayi);
        // ayni degeri goruruz farkli random gormek icin tekrar random methodunu cagirmamiz gerekir

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
        // burada ise her birisinde farkli random sayilari uretti.


    }
}
