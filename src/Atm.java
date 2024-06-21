import java.util.Scanner;

public class Atm {

    public void calis(Account account){

        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("***************************");
        System.out.println("Kullanıcı girişi");
        System.out.println("***************************");
        int girisHakki = 3;

        while(true){
            if(login.login(account)){
                System.out.println("Giriş başarılı...");
                break;
            }
            else {
                girisHakki--;
                System.out.println("Giriş başarısız kalan giriş hakkı : " + girisHakki);
            }

            if(girisHakki==0){
                System.out.println("Giriş hakkınız bitti");
                return;
            }
        }

        System.out.println("*********************************");
        String islemler = "1. Bakiye Görüntüle\n"
                + "2. Para Yatırma\n"
                + "3. Para Çekme\n"
                + "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("**********************************");


        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){

                break;

            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz : " + account.getBakiye());
            }
            else if (islem.equals("2")){

                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.paraYatir(tutar);

            }
            else if (islem.equals("3")) {

                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.paraCek(tutar);

            }
            else {

                System.out.println("Geçersiz İşlem....");
            }



        }
    }
}
