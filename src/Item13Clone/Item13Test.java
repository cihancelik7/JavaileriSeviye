package Item13Clone;

public class Item13Test {
    public static void main(String[] args) {
        //Shallow Copy
        Stack st = new Stack();
        Stack st1 = st;
        System.out.println(st == st1); // true
        // eger st de bir sey degisirse st1 de de degisim olur bu kotu olur


        // Deep Copy
        Stack stc = new Stack();
        stc.stackName = "Cihan";

        Stack stc2 = new Stack();
        stc2.stackName = stc.stackName;

        System.out.println(stc == stc2);
        // Burada ise false donuyor

    }
}
