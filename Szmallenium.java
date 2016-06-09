/**
 * Created by Melious on 03.06.2016.
 */
public class Szmallenium {

    Stan stanBezKarty;
    Stan stanKarta;
    Stan stanWyplata;
    Stan stanPusty;

    Stan stan = stanPusty;
    int hajs = 0;

    public Szmallenium(int dostepnyHajs) {
        stanBezKarty = new StanBezKarty(this);
        stanKarta = new StanKarta(this);
        stanWyplata = new StanWyplata(this);
        stanPusty = new StanPusty(this);

        this.hajs = dostepnyHajs;
        if (dostepnyHajs > 0) {
            stan = stanBezKarty;
        }

    }

    public void wlozKarte() {
        stan.wlozKarte();
    }

    public void wprowadzPin(Karta karta) {
        stan.wprowadzPin(karta);
    }

    public void wyplac() {
        stan.wyplac();
    }

    void wyplacKwote(int kwota) {
        hajs = hajs - kwota;
        System.out.println("Podana kwota została wypłacona.");
    }

    void oddajKarte() {
        System.out.println("Karta została zwrócona.");
    }

    void blokujKarte(Karta karta) { System.out.println("Karta została zablokowana."); }

    void ileZostaloHajsu() {System.out.println(getHajs());}  // pomocniczo żeby sprawdzić saldo bankomatu




    //////////////////////////////////////////////////////////////////////


    public Stan getStanBezKarty() {
        return stanBezKarty;
    }

    public void setStanBezKarty(Stan stanBezKarty) {
        this.stanBezKarty = stanBezKarty;
    }

    public int getHajs() {
        return hajs;
    }

    public void setHajs(int hajs) {
        this.hajs = hajs;
    }

    public Stan getStanKarta() {
        return stanKarta;
    }

    public void setStanKarta(Stan stanKarta) {
        this.stanKarta = stanKarta;
    }


    public Stan getStanWyplata() {
        return stanWyplata;
    }

    public void setStanWyplata(Stan stanWyplata) {
        this.stanWyplata = stanWyplata;
    }

    public Stan getStanPusty() {
        return stanPusty;
    }

    public void setStanPusty(Stan stanPusty) {
        this.stanPusty = stanPusty;
    }

    public Stan getStan() {
        return stan;
    }

    public void setStan(Stan stan) {
        this.stan = stan;
    }


}
