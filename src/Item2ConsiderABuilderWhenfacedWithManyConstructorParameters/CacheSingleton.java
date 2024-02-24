package Item2ConsiderABuilderWhenfacedWithManyConstructorParameters;

import Item3EnforceTheSingletonPropertyWithAPrivateConstructorOrAnEnumType.Cache;

import java.util.HashMap;
/*
herhangi bir constructor gerektirmez ayrica herhangi bir method da yazmadik
 */
public enum CacheSingleton implements Cache {
    INSTANCE;

    private HashMap<Object,Object> map = new HashMap<Object,Object>();

    @Override
    public void put(Object key, Object value) {
        map = new HashMap<Object,Object>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }
}
