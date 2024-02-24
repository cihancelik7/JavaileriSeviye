package Item2ConsiderABuilderWhenfacedWithManyConstructorParameters;

public class Item2Test {
    public static void main(String[] args) throws Exception {
        // contructor olusturdugumuz yani gerekli urunleri zorunlu istiyor fakat istege bagli olustugurdugumuz degerleri sanki method cagirir gibi sonuna sokta koyarak kullaniriz
        Starbucks sb = new Starbucks.Builder("Tall","Latte").yumusakIcimDurumu("Yumusak icim").build();

    }
}
