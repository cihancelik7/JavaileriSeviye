package Item4EnforceNoinstaniabilityWithAPrivateConstructor;
/*
// yardimci siniflara neden ihtiyac duyariz, Collections.sort(); ortak methodlar var ve sadece method icerir
, nesne olusturmak sacma olacagi icin constructor methodu private olusturulmustur
 */
import java.util.Collections;

public class Item4Test {
    public static void main(String[] args) {
        // utility siniflarini abstract olusturmayin cunku bunu extend eden bir sinifa nesne olusturulur ve burada hata olusur
        Dene d = new Dene();
        // bu da bir kullanim yontemlerinden birisi   yardimci method olusturuyor
        Enum.topla();
    }
}
