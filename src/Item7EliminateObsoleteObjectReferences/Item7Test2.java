package Item7EliminateObsoleteObjectReferences;

import java.util.ArrayList;
import java.util.Random;

public class Item7Test2 {


    private static Random random = new Random();

    //@GetMapping("/hello2")
    public static void main(String[] args) {

        // burada statik olmayan bir objenin icerisinde olusturdu ve simdi ikisinin kapladigi yere bakacagiz..
        ArrayList<Double> list = new ArrayList<Double>(1000000);
        for (int i = 0; i< 1000000; i++){
            list.add(random.nextDouble());
        }

    }
}
