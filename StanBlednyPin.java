/**
 * Created by Melious on 03.06.2016.
 */
public class StanBlednyPin implements Stan {

   Szmallenium szmallenium;

    public StanBlednyPin(Szmallenium szmallenium) {
        this.szmallenium = szmallenium;
    }

    @Override
    public void wlozKarte() {
        System.out.println("Karta znajduje się już w bankomacie.");
    }

    @Override
    public void wprowadzPin(int kodPin) {
        System.out.println("Operacja niedozwolona. Karta jest zablokowana.");

    }

    @Override
    public void wyplac() {
        System.out.println("Operacja niedozwolona. Karta jest zablokowana.");
    }

    @Override
    public void blokujKarte() {
        System.out.println("Trzy razy błędnie wprowadziłeś kod PIN. Zablokowaliśmy kartę.");
        szmallenium.oddajKarte();
        szmallenium.setStan(szmallenium.getStanBezKarty());

    }


}

