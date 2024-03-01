package Item10_11HashCodeEquals;

public class DenemeSinif {
    int a,b;
    public DenemeSinif(int a,int b){
        this.a = a;
        this.b = b;
    }

    // bu default equals in tanimi yani default bir degeri yine kendisi icin equals yaparsaniz bir obje alir ve otomatik hep true dondurur
    public boolean equals(Object obj){
        return (this == obj);
    }
}
