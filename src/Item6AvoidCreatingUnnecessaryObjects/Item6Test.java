package Item6AvoidCreatingUnnecessaryObjects;

import Item5PreferDependencyInjectionToHardwiringResources.Sozluk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Item6Test {
    public static void main(String[] args) {

        String kelime = new String("bikini");
        String kelime2 = "bikini";
        String kelime3 = "bikini";

        // arasindaki fark ne?

        System.out.println(kelime == kelime2);
        // memory acisindan asagidaki gibi olusurulanlar ayni yerde tutulur
        System.out.println(kelime2 == kelime3);


        long start = System.nanoTime();
        topla();

        long end = System.nanoTime();
        long totalTime = end-start;
        System.out.println(totalTime);//60019

        long start2 = System.nanoTime();
        toplaPrimitive();
        long end2 = System.nanoTime();
        long totalTime2 = end2 - start2;
        System.out.println(totalTime2);//4469
        // burada gordugumuz uzere ikinci yontem ile kullanim ve olusturma suresi ciddi derecede kisaldi.
        // neden boyle sonuc aldi bu kadar ciddi bir fark var?
        // ilkinde donusturme yaptigi icin vakit aliyor

        List<Integer> list = new ArrayList<Integer>();
        int sum2 = 0;
        for (Integer i : list){
            if (i % 2 == 0)/* i.intValue() ye esit*/{


            }
        }

        // Autoboxing - Unboxing
        ArrayList<Integer> integer = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integer.add(i);
            // integer bir dosyaya primitive tipten bir int olusturur


        }


    }
    private static long toplaPrimitive(){
        long sum = 0;
        for (int i = 0; i < 150; i++) {
            sum += i;
        }
        return sum;
    }

    private static long topla() {
        Long sum = 0l;

        for (int i = 0; i < 150; i++) {
            sum += i;
        }
        return sum;
    }
}
