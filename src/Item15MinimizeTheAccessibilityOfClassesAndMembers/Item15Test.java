package Item15MinimizeTheAccessibilityOfClassesAndMembers;

public class Item15Test {
    public static void main(String[] args) {
        GuvenliKod gk = new GuvenliKod();
        //  gk.message erisemiyoruz cunku method procate
            gk.a();

        gk.message2();
        gk.message3();
        gk.a();
      // gk.aass = "s"; hata alir cunku final olarak atanmis



    }
}
