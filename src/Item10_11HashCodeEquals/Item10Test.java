package Item10_11HashCodeEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item10Test {
    public static void main(String[] args) {

        // PART 1

        // Integer - type
        System.out.println(10 == 20);   // false
        // char - type
        System.out.println('a' == 'b'); // false
        // char and double type
        System.out.println('a' == 97.0);// true
        // boolean type
        System.out.println(true == true);// true


        System.out.println((int) 'a'); // cast char to int                 -------- 97
        System.out.println('a' == 97); // char is automatically promoted to int---- true
        System.out.println('a' + 1);   // char is automatically promoted to int---- 98
        System.out.println((char) 98); // cast int to char                 -------- b

       DenemeSinif a = new DenemeSinif(1, 2);
        DenemeSinif a2 = new DenemeSinif(1, 2);
       System.out.println(a == a2); // false cunku ikisini de ayri referanslarda tutuyor

        System.out.println(a.equals(a2));   // false doner , equals ve hash code u neden override etmemiz gerektigini asagida anlayacagiz


        // PART 2
        DenemeSinif deneme = new DenemeSinif(10,11);
        DenemeSinif deneme2 = new DenemeSinif(10,11);

        if (deneme.equals(deneme2)){
            System.out.println("Biz esitiz");
        }else {
            System.out.println("Esit degiliz");
        }
        // ciktimiz esit degiliz olarak cikar


        // PART 3

        DenemeSinifOverride deneme3 = new DenemeSinifOverride(10,11);
        DenemeSinifOverride deneme4 = new DenemeSinifOverride(10,11);

        if (deneme3.equals(deneme4)){
            System.out.println("Biz esitiz");
        }else {
            System.out.println("Biz esit degiliz");
        }
        // burada ciktimiz ise biz esitiz olur cunku equals methodunu override ettik


        // PART 4

        /*
        reflexive  : an objext must equal itself x.equals(x)  bir objenin kendine esit olmasi
        symmetric  : x.equals(y) must return the same result as y.equals(x)  iki objenin birbirine simetrik olmasidir deneme 3 deneme 4 e esitse deneme 4 te deneme 3 e esit olmali
        transitive : if x.equals(y) and y.equals(z) then also x.equals(z)      mesela x y ye esitse y z ye esitse x in z ye de esit olmasi beklenir
        consistent  : the value of equals() should change only if a property that is contained in equals() changes(no randomness allowed) deneme3 un null kontrolu sirasinda her zaman false dondurmesini beklemeliyiz ona gore auarlamaliyiz
        null control a.equals(null)
         */

        // PART 5 inheritance icerisinde equals kullanimi gorduk

        // PART 6
        // NE ZAMAN EQUALS I OVERRIDE EDERSEK MUTLAKA HASHCODE U DA OVERRIDE ETMELIYIZ
        List<DenemeSinif> list2 = new ArrayList<>();
        DenemeSinif r = new DenemeSinif(3,4);
        list2.add(r);
        System.out.println("Override edilmemis hashcode: "+list2.contains(new DenemeSinif(3,4)));
        // burada degerimiz false donuyor


        // burada da override edilmis bir method uzerinden liste olusturalim
        List<DenemeSinifOverride> list = new ArrayList<>();
        DenemeSinifOverride e = new DenemeSinifOverride(1,2);
        list.add(e);
        System.out.println("Override edilmis hashcode: "+list.contains(new DenemeSinifOverride(1,2)));
        // burada ise override oldugu icin true donuyor


        // Part 7
        // Hash Code
        DenemeSinifOverride denemeOvr1 = new DenemeSinifOverride(1,2);
        DenemeSinifOverride denemeOvr2 = new DenemeSinifOverride(3,4);
        DenemeSinifOverride denemeOvr3 = new DenemeSinifOverride(1,2);
        System.out.println(denemeOvr1.hashCode());// basta hashmap override etmedik
        System.out.println(denemeOvr2.hashCode());
        System.out.println(denemeOvr3.hashCode());

        Map<DenemeSinifOverride,String> m = new HashMap<>();
        m.put(new DenemeSinifOverride(1,2),"IkiEleman");

        System.out.println(m.get(new DenemeSinifOverride(1,2)));


    }
}
