package Item1ConsiderStaticFactoryMethodsInsteadOfConstructors;

public class Kofte extends Yemek{
    public Kofte(String soguk) {
        super(Boolean.parseBoolean(soguk));
    }
}
