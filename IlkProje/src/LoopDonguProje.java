import javax.swing.*;

public class LoopDonguProje {
    //Proje
    //Hello world yazımmıjn mevcut
    //bu yazi içindeki "o" ları 0 ile değiştir.
    public static void main(String[] args) {
        String hello = "Hello World";
        int stringUzunlugu = hello.length();
        int index =0;
        String yeniString = "";

        while(index < stringUzunlugu){
        char bulunanKarakter = hello.charAt(index);
        if(bulunanKarakter == 'o'){
            yeniString = yeniString +0;
        } else {
            yeniString = yeniString + bulunanKarakter;
        }
        index++;
        }
        System.out.println(yeniString);
    }
}
