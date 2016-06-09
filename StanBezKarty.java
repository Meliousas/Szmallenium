/**
 * Created by Melious on 03.06.2016.
 */
public class StanBezKarty implements Stan {
    Szmallenium szmallenium;

    public StanBezKarty(Szmallenium szmallenium) {
        this.szmallenium = szmallenium;
    }

    public void wlozKarte(){
        System.out.println("Karta przyjęta.");
        szmallenium.setStan(szmallenium.getStanKarta());
    }


    public void wprowadzPin(Karta karta){
        System.out.println("Przed wprowadzeniem kodu PIN włóż kartę.");
    }
    public void wyplac(){
        System.out.println("Operacja niedozwolona.");
    }

}
