package Item1ConsiderStaticFactoryMethodsInsteadOfConstructors;

public class Dondurma extends Yemek{

    public Dondurma(String name) {
        super(Boolean.parseBoolean(name));
    }
}
