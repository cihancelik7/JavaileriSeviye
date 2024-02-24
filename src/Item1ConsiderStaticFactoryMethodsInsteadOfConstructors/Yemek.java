package Item1ConsiderStaticFactoryMethodsInsteadOfConstructors;

public class Yemek {

    String name;


    public Yemek(boolean soguk) {

    }


    public static Yemek sogukYemek(String name) {
        // Soguk Yemek
        return new Dondurma("Dondurma");
    }

    public static Yemek sicakYemek(String name) {
        return new Kofte("Kofte ");
    }
}