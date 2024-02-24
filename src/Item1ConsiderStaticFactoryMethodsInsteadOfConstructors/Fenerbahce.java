package Item1ConsiderStaticFactoryMethodsInsteadOfConstructors;

public class Fenerbahce {
    private String yeniFutbolcu,yeniTeknikDirektor;
    private int age;

    public Fenerbahce(String yeniFutbolcu,int age){
        this.yeniFutbolcu = yeniFutbolcu;
        this.age = age;
    }
    public Fenerbahce(String yeniTeknikDirektor){
        this.yeniTeknikDirektor = yeniTeknikDirektor;

    }

    public static Fenerbahce yeniFutbolcuUret(String yeniFutbolcu){
        return new Fenerbahce(yeniFutbolcu,22);
    }
}
