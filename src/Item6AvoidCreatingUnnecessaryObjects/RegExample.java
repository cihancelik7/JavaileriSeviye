package Item6AvoidCreatingUnnecessaryObjects;

import java.util.regex.Pattern;

public class RegExample {

    public static boolean isRomanNumeral(String a){

        // mesela insanlarin mesajlar yazdigi bir sayfada kullanicinin yazacagi uygunsuz icerikleri ayiklamak icin bu regex i kullaniyorsan
        // her bir yazim da 2 farkli nesne olusturacak ve ileride kullanici sayisi cok fazlalara ciktiginda ciddi bir yer kaplayacak
        // garbage coolector kullanmak da  faydali fakat diger cozum icin bunu alip disarida calistiririz.
        return a.matches("ˆ(?=.)M*(C[MD]| D?C{0,3}) (I[XV]| V?I{0,3})$");
    }

    // bu sefer bunu disarida olusturduk
    // nesne uretme islemlerinden kurtulmus oluruz
    private static final Pattern ROMAN = Pattern.compile("ˆ(?=.)M*(C[MD]| D?C{0,3}) (I[XV]| V?I{0,3})$");

    // burada methodumuzu da aliriz
    static boolean isNonNumeral(String s){
        // artik yukaridaki yol acacak cilelerden kurtuluruz.
        return ROMAN.matcher(s).matches();
    }

}

