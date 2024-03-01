package Item12AlwaysOverridetoString;

public class Item12Test {
    public static void main(String[] args) {
        Request as = new Request();
        as.setBody("Govde");
        as.setHeader("Kafa");

        System.out.println(as.toString());// olusturulan sinifin hashcode unun hexadecimal gosterimini veriyor, istedigimiz tarzda bilgilendirmeyi almak icin tostring override yapmaliyiz

        // daha sonra tostring override edilmis sekilde yazdirdigimizda bize Request{header='Kafa', body='Govde'} sonucunu verdi
        // fakat bu otomatik override edilmis toString methodu simdi bunu farkli bir sekilde nasil override ederiz.

        // daha sonra google kutuphanesi kullanarak gson dosyayi bize json formatta tostring yapiyor

    }
}
