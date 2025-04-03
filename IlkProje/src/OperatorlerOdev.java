public class OperatorlerOdev {
    //iki adet integer, 85 ve 45
    //konsola değişkenleri kullanarak iki ayrı satıorda sayıların toplamını ve çarpımını yazdırım
    //örnek: "Sayıların toplamı 130 dur"
    //eğer sayıların çarpımı 3000 den büyük ve 4000 den küçükse, konsola sayıların çarpım değerini yazınız
    public static void main(String[] args) {
        int a= 85;
        int b= 45;
        int toplam= a+b;
        System.out.println("Sayiların toplamı: " + toplam + " dur");
        int carpim = a*b;
        System.out.println("Sayıların çarpımı: " + carpim + " dur");
        if (a*b>3000 && a*b<4000){
            System.out.println(carpim);
        }
        else{
            System.out.println("Yanlışlık oldu!!");
        }
    }
}
