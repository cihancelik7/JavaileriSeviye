package Item3EnforceTheSingletonPropertyWithAPrivateConstructorOrAnEnumType;

import java.util.HashMap;
/*  Lazy singleton imp SADECE CAGIRILDIGINDA instance null ise lazy cache uret eger degilse olani ver

Private contructor olmak zorunda ve bunu cagiran bir getinstance methodu icerisinde olusturmali

 */

public class LazyCache implements Cache {
    private static LazyCache instance;
    private HashMap<Object, Object> map;

    private LazyCache() {
        map = new HashMap<Object, Object>();
    }

    @Override
    public void put(Object key, Object value) {
        map = new HashMap<Object, Object>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    public static LazyCache getInstance() {
        if (instance == null) {
            instance = new LazyCache();
        }
        return instance;
    }
}
