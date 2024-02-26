package Item7EliminateObsoleteObjectReferences;

public class GarbageCollection {

    public void finalize(){
        System.out.println("Copler temizlendi");
    }
    public static void main(String[] args) {


        GarbageCollection aa = new GarbageCollection();
        GarbageCollection bb = new GarbageCollection();
        GarbageCollection cc = new GarbageCollection();


        // garbage collectoru tetiklemek icin bu methodu kullaniriz
        // garbage collector kullanim suresi doldugunda otomatik olarak silmeyi saglar boylelikle
        // bosa yer kaplamadan kurtulmus oluruz.

        // aa icerisini null yaptigimizda bize copler temizlendi dedi
        aa = null;


        // burada da birisini digerine esitledigimizde esitlenenlerden digeri icin olusturulan dosyayi yok ediyor ayni degere esit oldugu icin
        // direkt onu yansitiyor ayri yer kaplamiyor
        cc = bb;
        // burada manuel tetikliyoruz fakat kompleks algoritmalari var ayrica,
        System.gc();
    }

}
