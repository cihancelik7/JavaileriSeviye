package Item3EnforceTheSingletonPropertyWithAPrivateConstructorOrAnEnumType;

import java.util.HashMap;
/*
Eager yani sabirsiz anlaminda yani cagirilmayi beklemiyor direkt olusturuluyor.

Lazy ile eager arasindaki temel fark eager daha cagirilmadan olusturuluyor fakat lazy sadece cagirildirinda olusturur.

private constructor var ve bunu cagiran bir method var
 */
public class EagerCache implements Cache{

    private static final EagerCache instance  = new EagerCache();

    private HashMap<Object,Object> map;
    private EagerCache(){
        map = new HashMap<Object,Object>();
    }


    @Override
    public void put(Object key, Object value) {
     map = new HashMap<Object,Object>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }
    public static EagerCache getInstance(){
        return instance;
    }
}
