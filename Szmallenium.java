/**
 * Created by Melious on 03.06.2016.
 */
public class Szmallenium {

    Stan stanBezKarty;
    Stan stanKarta;
    Stan stanBlednyPin;
    Stan stanWyplata;
    Stan stanPusty;

    Stan stan = stanPusty;
    int hajs = 0;

    public Szmallenium(int dostepnyHajs) {
        stanBezKarty = new StanBezKarty(this);
        stanKarta = new StanKarta(this);
        stanBlednyPin = new StanBlednyPin(this);
        stanWyplata = new StanWyplata(this);
        stanPusty = new StanPusty(this);

        this.hajs = dostepnyHajs;
        if (dostepnyHajs > 0) {
            stan = stanBezKarty;
        }
        ;
    }

    public void wlozKarte() {
        stan.wlozKarte();
    }

    public void wprowadzPin(int kodPin) {
        stan.wprowadzPin(kodPin);
    }

    public void wyplac() {
        stan.wyplac();
    }

    public void blokujKarte() {
        stan.blokujKarte();
    }

    void wyplacKwote() {
        System.out.println("Podana kwota została wypłacona.");
    }

    void oddajKarte() {
        System.out.println("Karta została zwrócona.");
    }




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

    public Stan getStanBlednyPin(int kodPin) {
        return stanBlednyPin;
    }

    public void setStanBlednyPin(Stan stanBlednyPin) {
        this.stanBlednyPin = stanBlednyPin;
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
