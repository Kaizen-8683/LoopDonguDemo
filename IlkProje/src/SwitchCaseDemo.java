public class SwitchCaseDemo {
    public static void main(String[] args) {
        //     int sayi =3;
        //  if (sayi==1){
        //      System.out.println("Verilen sayi 1 e eşittir");
        // }
        // else if (sayi==2){
        //  System.out.println("Verilen sayi 2 ye eşittir");
        //}
        //else
        //  {
        //    System.out.println("Verilen sayi 1 yada 2 ye eşit değildir");
        //  }
        // }
        int sayi = 5;
        switch (sayi) {
            case 1:
                System.out.println("Verilen sayi 1 e eşittir");
                break;
            case 2:
                System.out.println("Verilen sayi 2 ye eşittir");
                break;
            default:
                System.out.println("Verilen sayi 1 e yada 2 ye eşlit değildir!!!!");
        }

        int bulundugumuzAy = 15;
        switch (bulundugumuzAy){
            case 1:
                System.out.println("Bulunduğumuz Ay Ocak'tır");
                break;
            case 2:
                System.out.println("Bulunduğumuz Ay Şubattır");
                break;
            case 3:
                System.out.println("Bulunduğumuz Ay Marttır");
                break;
            case 4:
                System.out.println("Bulunduğumuz Ay Nisandır");
                break;
            case 5:
                System.out.println("Bulunduğumuz Ay Mayıstır");
                break;
            case 6:
                System.out.println("Bulunduğumuz Ay Hazirandır");
                break;
            case 7:
                System.out.println("Bulunduğumuz Ay Tewmmuzdur");
                break;
            case 8:
                System.out.println("Bulunduğumuz Ay Ağustostur");
                break;
                case 9:
                System.out.println("Bulunduğumuz Ay Eylüldür");
                break;
            case 10:
                System.out.println("Bulunduğumuz Ay Ekimdir");
                break;
            case 11:
                System.out.println("Bulunduğumuz Ay Kasımdır");
                break;
            case 12:
                System.out.println("Bulunduğumuz Ay Aralıktır");
            default:
                System.out.println("Girilen değer yanlıştır. Hiçbiri ile uyuşmamaktadır!!!!!!!!!.");
        }

        String browser = "Chrome";
        switch (browser){
            case "Chrome":
                System.out.println("Chrome browserini başlat");
                break;
            case "Firefox":
                System.out.println("Firtefox browserini başlat");
                break;
            default:
                System.out.println("Tanimsiz bir browser");
        }
    }
}
