package Item16InPublicClassesUseAccessorMethodsNotPublicFields;



public class Item16Test {
    // encapsulation

    public static void main(String[] args) {
        Futbol fb = new Futbol("BursaSpor",35);

        /*
        System.out.println(fb.takimAdi);
        fb.takimAdi = "BursaSpor:(";
        System.out.println(fb.takimAdi);
         encapsulation olmasi dogrudan erisilebilirligi kes
         */

        fb.setTakimAdi("Bursa Spor Kumeye");
        // set ozelligi sayesinde kullanici isteidigini yazamiyor sadece bizim izin verdigimizi yazabilir
        System.out.println(fb.getTakimAdi()); //Bursa Sporu yikmaya calisan gucler Hic bir zaman kazanamayacak, Bursa Spor Her Zaman Olacak!!!Efsane BursaSpor!!!

        // burada kullanici degisim yapabiliyor ama set methodu icerisinde degisim yapabilir yani benim izin verdigim dogrultuda

        // eger class icerisinde set methodunu silersek bu sefer sadece kullanici get ile goruntuleme yapar(readOnly) ya da sadece set edilmesini istiyorsak bu sefer sadece set ediyor
        // eger get i de silersek bu sefer hic bir sey yapamayiz

        // part 2

        Time t= new Time(10,11);

        // t.hour = 130; burada degistirmeye izin vermiyor
        System.out.println(t.hour+":"+t.minute);//10:11

    }

}
