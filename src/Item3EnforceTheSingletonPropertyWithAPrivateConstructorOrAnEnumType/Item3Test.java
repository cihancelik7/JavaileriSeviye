package Item3EnforceTheSingletonPropertyWithAPrivateConstructorOrAnEnumType;

import Item2ConsiderABuilderWhenfacedWithManyConstructorParameters.CacheSingleton;

public class Item3Test {
    public static void main(String[] args) {

        DefineSingleton ds =  DefineSingleton.ds;
        DefineSingleton ds2 =  DefineSingleton.getInstance();

        //klasik singleton methodu bu gordugumuz gibi hash code lari ayni yani ayni instanceleri bulunduruyor
        System.out.println(ds.hashCode());
        System.out.println(ds2.hashCode());


        // Singletondaki amac tek bir instance yaratmak
        // Iki adet thread ayni anda benim singleton  methoduma girerse?
        // ozaman da gercekten tek instance prensibimi koruyor muyum?

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                }catch (InterruptedException e){

                }

                System.out.println("HashCode of Lazy: "+LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager: "+EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum: "+ CacheSingleton.INSTANCE.hashCode());

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("HashCode of Lazy:"+LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager:"+EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum:"+CacheSingleton.INSTANCE.hashCode());

            }
        }).start();
    // burada anladigimiz uzere lazy e ayni anda thread girdiginde instanceler degisti
        // eager sinifinda olusturduk ve ihtiyacimiz olmasa bile bir yer ayiriyor
        // fakat enumda yok




    }
}
