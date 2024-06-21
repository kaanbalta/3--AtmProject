//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Atm atm = new Atm();
        Account account = new Account("KaanB","123",10000);

        atm.calis(account);
        System.out.println("Programdan çıkılıyor");
    }
}