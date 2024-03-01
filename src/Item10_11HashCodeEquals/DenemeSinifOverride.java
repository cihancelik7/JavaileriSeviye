package Item10_11HashCodeEquals;

public class DenemeSinifOverride {
    private int a, b;

    public DenemeSinifOverride(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    // burada equals methodu override edilir
    public boolean equals(Object o) {
        // burada override yaptigimizda default durumunda gelecek true nun uzerine yazmis olursunuz
        if (o == this) {
            // reflexive
            return true;
        }
        if (!(o instanceof DenemeSinifOverride)) {
            // burada bu obje bu sinifin bir instancesi degilse o zaman direkt false dondur
            return false;
        }
        DenemeSinifOverride c = (DenemeSinifOverride) o;
        // type casting operasyonu, yani iceriye eleman sokup onlari compare ediyorum

        return Integer.compare(a,c.a) == 0
                && Integer.compare(b,c.b) == 0;
    }
//    public boolean equals(DenemeSinifOverride obj){
//        // burada overload yapmis oluruz fakat yukaridaki equalsi gevcersiz kilmiyoruz yukaridaki equals methodu calisiyor
//        return super.equals(obj);
//    }

    @Override
    public int hashCode(){
        // icerisine arguman koyarsak bu sever overload olur write olmaz
        int result = Integer.hashCode(b);
        result = 31*result+Integer.hashCode(a);
        return result;
    }
//    @Override
//    public int hashCode(){
//        return Objects.hash(a,b);
//        // bu ozellik cok yavaslik saglar kutulama acma ve autocastingler var bu yuzden yukaridaki yontemi kullanmaliyiz
//    }

}
