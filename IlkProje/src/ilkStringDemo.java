import java.util.Locale;
import java.util.SimpleTimeZone;

public class ilkStringDemo {
    public static void main(String[] args) {
        String ilkMetin ="Test Otomasyonu çok güzel";
        String ikinciMetin = "Eye For an Eye!!";
        System.out.println(ilkMetin);
        System.out.println(ikinciMetin);

        int metinUzunlugu =ilkMetin.length();
        System.out.println(metinUzunlugu);

        int metinUzun =ikinciMetin.length();
        System.out.println(metinUzun);

        String kucukHarf =ilkMetin.toLowerCase();
        System.out.println(kucukHarf);

        String buyukHarf = ikinciMetin.toUpperCase();
        System.out.println(buyukHarf);

        System.out.println(kucukHarf  +  buyukHarf);
        System.out.println(kucukHarf + buyukHarf + metinUzunlugu);

        String yeniString = "En sevdiğim \n\"film\" Avatar";
        System.out.println(yeniString);
    }
}
