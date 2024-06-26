public class Account {

    private String kullaniciAdi;
    private String parola;

    private int bakiye;

    public Account(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar){
        bakiye+=tutar;
        System.out.println("Yeni bakiyeniz : " + bakiye);
    }

    public void paraCek(int tutar){
        if(tutar>bakiye){
            System.out.println("Bakiyeniz yetersizdir şuandaki bakiyeniz : " + bakiye);
        }
        else {
            bakiye-=tutar;
            System.out.println("Yeni bakiyeniz : " + bakiye);
        }
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}
