public class ArrayDemo {
    public static void main(String[] args) {
        String[] isimler = {"Gözde","Masal","Rabia","Tarık","Fatma","Aras"};
        int[] sayilar = {23, 53, 35998};
        System.out.println(isimler[3]);
        System.out.println(sayilar[1]);


        String[] webUrl = {"www.hurriyet.com.tr", "www.sabah.com.tr"};
        System.out.println(webUrl[0]);

        int diziUzunlugu = isimler.length;
        System.out.println(diziUzunlugu);

        for ( int i=0; i< isimler.length;i++){
            System.out.println(isimler[i]);
        }
    }
}
