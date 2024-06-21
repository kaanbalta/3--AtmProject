import java.util.Scanner;

public class Login {

    public boolean login(Account account){

        Scanner input = new Scanner(System.in);
        String parola;
        String kullanıcıAdı;

        System.out.print("Kullanıcı adı giriniz : ");
        kullanıcıAdı = input.nextLine();
        System.out.print("Parola giriniz : ");
        parola = input.nextLine();

        if(account.getKullaniciAdi().equals(kullanıcıAdı) && account.getParola().equals(parola)){
            return true;
        }
        else {
            return false;
        }
    }
}
