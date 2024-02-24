package Item3EnforceTheSingletonPropertyWithAPrivateConstructorOrAnEnumType;

public interface Cache <F,S>{
    // burada put ile key ve value degeri atiyorum ardindan get icerisinde key i vererek value degerini aliyorum
    public void put(F key, S value);
    public S get(F key);
}
