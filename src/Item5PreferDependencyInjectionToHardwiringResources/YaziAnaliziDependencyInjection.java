package Item5PreferDependencyInjectionToHardwiringResources;

import java.util.function.Supplier;

public class YaziAnaliziDependencyInjection {
    private final Sozluk sozluk_;


    // this kullandigimizda _ yaparsak this kullanimini kaldirir
    public YaziAnaliziDependencyInjection(Supplier<Sozluk> sozluk) {
        sozluk_ = sozluk.get();
    }
    public boolean isValid(){

        return true;
    }
}
