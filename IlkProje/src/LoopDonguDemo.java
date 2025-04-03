public class LoopDonguDemo {
    public static void main(String[] args) {
        for (int i=0; i<=50;i++){
            System.out.println("Değişkenişmizin değeri "  + i);
        }
        //i değerini 0.25 arttırıcaz
        for (double i=0; i<10;i=i+0.25){
            System.out.println("Değişkenimizin değeri "+i);
        }
        System.out.println("-----------------------------------------------------------");

        int sayfa = 5;
        for(int i=1; i<sayfa; i++){
            System.out.println("sayfa sayisi " +i);
            if(i==3){
                System.out.println("Koul saglandi "+i);
                break;
            }
        }

        System.out.println("--------------------------------------------");
        String[] isimler = {"Ozan", "Onur","Hazal","Tibet"};
                for(int i=0; i< isimler.length; i++){
                    System.out.println("Listedeki isimler "+ isimler[i]);
                }
        System.out.println("----------------------------------------------");
                for (String isim:isimler){
                    System.out.println("Glişmiş döngü ile isimler "+isim);
                }
    }
}
