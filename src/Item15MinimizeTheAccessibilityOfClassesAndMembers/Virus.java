package Item15MinimizeTheAccessibilityOfClassesAndMembers;

public class Virus {
    public String virus(){

        String virusUrl = "http:virusluhabervaramanacma.com";
        GuvenliKod.ANLASMALI_SITELER[0] = "virusUrl";
        // normalde final bir array e atama yapamiyorsunuz fakat burada atama yapiliyor
        GuvenliKod.haberleriAl(virusUrl);
        // bu bir guvenlik acigi bunun cozumu icin publicten cikar final yap sonra unmodyible List ve ya clone olarak yapmaliyiz
        return "";
    }
}
