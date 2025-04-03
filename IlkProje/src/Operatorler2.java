public class Operatorler2 {
    public static void main(String[] args) {
        int a =45;
        int b= 40;
        int c=60;
        // karşılaştırma operatörleri
        // ==, !=, >, <, >=, <=
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

       // if (a>40 && c<70){
        //    System.out.println("Koşul sağlandı");
       // }
        if(a>40 || c<50){
            System.out.println("Koşul Sağlandı");
        }
    }
}
