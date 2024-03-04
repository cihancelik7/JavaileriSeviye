package Item16InPublicClassesUseAccessorMethodsNotPublicFields;

public class Futbol {
    // 1->  dogrudan erisilebilirligi kes
    // 2-> verilerinde kontrol sagliyorum setmethoduyla
    // 3-> ReadOnly setMethodunu sildigimizde sadewce get kalirsa
    // 4-> WriteOnly get methodunu sildigimizde sadece set methodu kaldiginda---> bunlari daha detayli bir sekilde itemTest16 Class inda anlattim
    // 5-> Data hiding..
    private String takimAdi;
    public int takimOyuncuSayisi;

    public Futbol(String takimAdi, int takimOyuncuSayisi) {
        this.takimAdi = takimAdi;
        this.takimOyuncuSayisi = takimOyuncuSayisi;
    }
    public String getTakimAdi() {
        return takimAdi;
    }

    public void setTakimAdi(String takimAdi) {
        if (takimAdi != "EfsaneBursaSpor") {
            System.out.println("\n Bursa Sporu yikmaya calisan gucler \n Hic bir zaman kazanamayacak, \n Bursa Spor Her Zaman Olacak!!!");
            takimAdi = "Efsane BursaSpor!!!";
        }
        this.takimAdi = takimAdi;
    }

    public int getTakimOyuncuSayisi() {
        return takimOyuncuSayisi;
    }

    public void setTakimOyuncuSayisi(int takimOyuncuSayisi) {
        this.takimOyuncuSayisi = takimOyuncuSayisi;
    }

}
