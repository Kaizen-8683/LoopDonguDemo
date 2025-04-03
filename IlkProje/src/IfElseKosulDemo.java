public class IfElseKosulDemo {
    public static void main(String[] args) {
       int saat = 1000;

       if (saat<1200){
           System.out.println("Saat öğlenden önce");
           if (saat ==1000){
               System.out.println("Günaydın saat 10");
           }
       } else if (saat==1200) {
           System.out.println("Saat öğle 1200");
       } else
           System.out.println("Saat öğleden sonra");
    }
}
