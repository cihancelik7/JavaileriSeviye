package Item9PreferTryWithResourcesToTryFinally;

import com.sun.source.tree.BreakTree;

import java.io.*;
import java.util.Scanner;

public class Item9Test {
    private static final int BUFFER_SIZE = 0;

    static String firstLineOfFirstFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        // klasik try final
        try {
            try {
                // burada bir try islemi daha yapmak istersek eger tekrar finally kullanmamiz gerekir ve okunma kirliligi olusur.
            } catch (Exception e) {
            } finally {

            }
            return br.readLine();
        } catch (Exception e) {
        } finally {
            br.close();
        }
        return path;
    }

    //yukaridaki okuma isleminin aynisini asagidaki try icerisine aliyoruz boylelikle finally e gerek kalmadi
    static String firstLineOfFileWell(String path, String defaultValue) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultValue;
        }

    }

    static void copy(String src, String dat) throws IOException {
        // input ve output stram okumalarini yapiyor ve finally kullanmadan direkt okulamari yapiyor
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dat)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }

    public static void main(String[] args) {
        // try, catch, finally
        Scanner scan = null;
        try {
            scan = new Scanner(new File("/Users/cihancelik/AndroidStudioProjects/AlgorihmJava/app/src/main/java/com/cihancelik/algorihmjava/test.java"));
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scan != null) {
                System.out.println("Hello");
                scan.close();
            }
            // BURADAKI EN ONEMLI SEY GORDUGUMUZ UZERE HEM CATCH ICERISINDE EXCEPTION CAR HEM DE FINALLY DE EXCEPTION YEME DURUMU VAR
            // EGER FINALLY DE EXCEPTION HATASI YERSEK YUKARIDA CATCH ICERISINDE DE YEME DURUMUNDA CATCH ICERISINDEKI EXCEPTION
            // HATASINI BIZE GOSTERMEZ SADECE FINALLY DE KI YIYECEGIMIZ EXCEPTIONU GORURUZ
        }

        /*

        // try - with - resources - try(rources)
        try {
            Scanner scan2 = new Scanner(new File("/Users/cihancelik/AndroidStudioProjects/AlgorihmJava/app/src/main/java/com/cihancelik/algorihmjava/test.java"));
         while (scan2.hasNext()){
             System.out.println(scan2.nextLine());
         }
        }catch (FileNotFoundException e){
            System.out.println("Hello");
            e.printStackTrace();
        }

        // bir diger ornek
        try {
            int data = 25 / 0;
            // aritmetik exception yedik
            System.out.println(data);
        }catch (NullPointerException e)
        {
            // hatayi burada gormesi gerekiyor fakat goremiyor
            System.out.println("Cihan");
        }
        finally {
            int data = 25 / 0;
            // eger burada exception hatasi almazsak once bunu yazar daha sonra catch icerisindeki exceptionu gosterir uani burada alacagimiz exception hatasi bizim icin cok onemli
            // hatayi burada gordu ve karsimiza bu exceptionu dondurdu
            System.out.println("Ben hep Calisirim...");
        }
*/

        // try catch finally
        try {
            int data = 25 / 5;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Ben hep calisirim");

            // burada cikti olarak once 5 degerini yani try icerisini daha sonrasinda karsimiza finally icerisindeki deger gelir
        }

        try {
            int data = 25 / 0;
            System.out.println(data);
        }catch (ArithmeticException e){
            System.out.println(e);
            // burada yukarida exception hatasi olarak arithmetic exception hatasini aldik
            // cunku dogru hatayi paylastik
    }
        finally {
            int data = 25 / 0;
            System.out.println("Ben hep calisirim");
        }
        }
}













