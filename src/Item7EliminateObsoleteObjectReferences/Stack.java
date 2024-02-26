package Item7EliminateObsoleteObjectReferences;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    // stack mantigi su dur : bir cantaya objeler koydugumuzu dusunursek , elimi cantaya attuigimda ilk geleni aliri
    // son giren ilk cikar mantigi uygulanir yani: LIFO


    public Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @Override
    protected void finalize() {
        System.out.println("Copler toplandi");
    }

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        // ekelmeek istedigimiz veriyi yer varsa direkt dosyanin icine at
        // yoksa formulun icinde belirttigimiz dosya boyutuna cikaririz
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            // eger canta bossa hata at
            throw new EmptyStackException();
        // eger cikiyorsa canta benim ayni array objemi al ama sonuncuyu dondurme,
        // referansin eski kalmasi yani cantada mesela 6 obje varsa pop yaptigimizda bize en son haric diger 5 ini verir
        return elements[--size];
    }

    public Object popWell() {
        if (size == 0)
            throw new EmptyStackException();

        Object result = elements[--size];
        elements[size] = null;

            /*
            burada yeni obje olusturup en son koydugumuz haric digerlerini alip buraya koyduk
             daha sonra element icerisini yani eski objemizin icerisini null yaparak
             ayni objelerin bulundugu yer kalabaligindan kurtulduk
             */

        return result;

    }

    /**
     * Ensure Space for at least one more element, roughly,
     * Doubling the capacity each time the array needs to grow
     */

    private void ensureCapacity() {
        if (elements.length == size) {

            // burada bir sey eklemek istiyorsan bos olmali eger dolu bir ortama ekleme yaparsan tasma yapar.
            // eger yer yoksa suana kadar ki yazdigim cantada yer yoksa yeni bir yer olustur ve hepsnini onun icine at
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
