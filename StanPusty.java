/**
 * Created by Melious on 03.06.2016.
 */
public class StanPusty implements Stan {
    Szmallenium szmallenium;

    public StanPusty(Szmallenium szmallenium) {
        this.szmallenium = szmallenium;
    }


    @Override
    public void wlozKarte() {
        System.out.println("Automat został zablokowany.");
    }

    @Override
    public void wprowadzPin(int kodPin) {
        System.out.println("Automat został zablokowany.");
    }

    @Override
    public void wyplac() {
        System.out.println("Automat został zablokowany.");
    }

    @Override
    public void blokujKarte() {
        System.out.println("Automat został zablokowany.");
    }
}
