public class MethodParametreDemo {
    public static void main(String[] args) {
        konsolCiktisi("Tarık");
        konsolCiktisi("Tarık");
        sayiTopla(14, 14);
        sayiTopla(34, 44);
        sinavNotu("Rabia Masal",100);
        sinavNotu("Aras",100);
        System.out.println("--------------------------");
        System.out.println(carpma(5,9));
        System.out.println(carpma(10,2));
        System.out.println("------------------");
        System.out.println(toplamaIslemi(12,15));
        System.out.println(toplamaIslemi(20, 15, 66));
    }
    private static void konsolCiktisi(String isim){
        System.out.println("Merhaba Dünya! " + "ve Merhaba " + isim);
    }

    private static void sayiTopla(int a,int b){

        System.out.println(a+b);
    }
     // Konsola kişinin adını ve sınav notunu yazdıran bir method oluşurun
    //Method 2 adet parametre alsın, ad ve sınav notu
    private static void sinavNotu(String ad, int not) {
        System.out.println(ad  +  " isimli öğrencinin notu " + not);
    }

    private static int carpma(int a, int b){
        int carpmaSonucu = a*b;
        return carpmaSonucu;
    }
    private static int toplamaIslemi(int a, int b){

        return a+b;
    }
    private static int toplamaIslemi(int a, int b, int c){
        return a+b+c;
    }

}
