package Item5PreferDependencyInjectionToHardwiringResources;

public class YaziAnaliziSingleton {

    private static final Sozluk turkce = new Sozluk("Turkce");
    public static YaziAnaliziSingleton INSTANCE = new YaziAnaliziSingleton();
    private YaziAnaliziSingleton(){}

    public static boolean isValid(){

        return true;
    }

}
