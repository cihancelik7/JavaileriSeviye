package Item15MinimizeTheAccessibilityOfClassesAndMembers;

 public class GuvenliKod {
    // eger classi abstract yaparsak nesne olusturamayiz baska classlarda
     // eger classi abstract yaparsak methodlarin da icerigi olmamali govdesi olmamali
    public static final String[] ANLASMALI_SITELER = new String[] { "http://hızlıguvenlitemizhaber.com," +
            "http://engergekciharikahaberler.com"};

    public static void haberleriAl (String url){
        for (String haberler : ANLASMALI_SITELER){
            if (url.equals(haberler)){
                // yap biseyler
            }
        }
    }

    public static String a = "a";
    // private static olsa da erisemez

    public static final String aass = "asd";
    // final oldugu icin gosterir fakat degistirmeye izin vermez



    public int aa = 10;


    private String asd = "Cihan";

    private void message(){
        System.out.println("Merhaba");
    } // bu gozukmuyor diger classlarda
    public String a(){
        message();  // sadece ayni class icerisinde gozukuyor farkli classlarda gozukmez mesela item15test classinda calismadi
        message2(); // bu protected oldugu icin sadece ayni paket icerisindekiler gorur mesela item12Test class inda cagirildi fakat cikmadi ama item15test classinda cikti
        return asd;

    }

    protected void message2(){
        System.out.println("Merhaba");
        // Protected in en onemli ozelliklerinden birisi de baska paket icerisinde bir classda kullanmak istersek bu sefer bunu class adiyla extend etmeliyiz ardindan kendi classina uygun sekilde nesne olusturup sanki o classin methoduymus gibi cagiririz
        }

        void message3(){
            System.out.println("Merhaba");
            // buradaki en onemli nokta su ki, ayni paket icerisindeki classlarda public gibi gorebilir fakat farkli paketlere extend etseniz bile bulamayacaktir bu methodu
        }


    }
