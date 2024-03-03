package Item13Clone;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INTIAL_CAPACITY = 16;

    public String stackName;

    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public Stack() {
        this.elements = new Object[DEFAULT_INTIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // ensure space for at least one more element.
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);

    }

    // CLONE METHOD FOR CLASS WITH REFERENCES TO MUTABLE STATE
    @Override
    public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    //    public Object clone()throws CloneNotSupportedException{
//        return super.clone();
     // DEFAULT OLARAK SUPER CLONE DEDIGIMIZDE GELEN METHOD
// }

    // To see that clone works, call with several command line arguments
    public static void main(String[] args)  {

        Stack stack = new Stack();
        String[] numbers = {"1", "2", "3", "4" };
        for (String arg : numbers) {
            stack.push(arg);
        }

            Stack copy = stack.clone();
            // basta bir clone methodu override etmedik throw olarak da CloneNotSupportedException firlattik karsimiza da yazdirinca bu hatayi aldik
            // bu hatayi cozmenin yolu yukarida class olusturuken 'implements' olarak 'Clonable' yapmamiz gerekir

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();

            while (!copy.isEmpty()) {
                System.out.print(copy.pop() + " ");
        }
            // 4 3 2 1
            // null null null null


        /*
         Simdi ise bir override methodu yazdik ve throw CloneNotSupportedException yazmamiza da gerek kalmadi, ayrica
         yazdigimiz method sayesinde clone ozelligini istedigimize gore yaptik ve yazdirdigimizda karsimiza bu sefer bu sonucu verdi;
         4 3 2 1
         4 3 2 1
         ilk objelerin oldugu liste icerisinde bir degisiklik yaparsak burada degismiyor yani durmadan degisen
         bir ana objemiz varsa ve clone unun degismemesini istiyorsak burada kullanmaliyiz.
         */


    }

}
