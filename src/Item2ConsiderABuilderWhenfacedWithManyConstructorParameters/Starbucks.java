package Item2ConsiderABuilderWhenfacedWithManyConstructorParameters;

public class Starbucks {
    // Gerekli
    private String boyut;
    private String tipi;

    // Secime Gore Degisen
    private String SutCinsi;
    private String yumusakIcim;

    public static class Builder {
        // Gerekli
        private final String boyut;
        private final String tipi;

        // Secime Gore Degisen
        private String SutCinsi;
        private String yumusakIcim;

        public Builder(String boyut, String tipi) {
            this.boyut = boyut;
            this.tipi = tipi;
        }

        public Builder sutDurumu(String sut) {
            SutCinsi = sut;
            return this;
        }

        public Builder yumusakIcimDurumu(String icim) throws Exception {
            if ("".equalsIgnoreCase(icim)){
                throw new Exception();
            }
            yumusakIcim = icim;
            return this;
        }

        public Starbucks build() {


            return new Starbucks(this);
        }
    }

    public Starbucks(Builder builder) {
        boyut = builder.boyut;
        tipi = builder.tipi;
        yumusakIcim = builder.yumusakIcim;
        SutCinsi = builder.SutCinsi;

    }







    /*
    JAVABEANS PATTERS

    // Her bir deger ihtimali icin ayri ayri constructor acmak yerine bos ac gerekirse setle.
    public Starbucks(){

    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public void setTipi(String tipi) {
        this.tipi = tipi;
    }

    public void setSutCinsi(String sutCinsi) {
        SutCinsi = sutCinsi;
    }

    public void setYumusakIcim(String yumusakIcim) {
        this.yumusakIcim = yumusakIcim;
    }
*/







/*
    // TELESCOPE PATTERN
    public Starbucks(String boyut, String tipi, String sutCinsi) {
        this.boyut = boyut;
        this.tipi = tipi;
        SutCinsi = sutCinsi;
    }

    public Starbucks(String boyut, String tipi) {
        this.boyut = boyut;
        this.tipi = tipi;
    }

     */
}
