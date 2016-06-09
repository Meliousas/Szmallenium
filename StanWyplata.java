/**
 * Created by Melious on 03.06.2016.
 */
import java.util.Scanner;
public class StanWyplata implements Stan {

    Szmallenium szmallenium;

    public StanWyplata(Szmallenium szmallenium) {
        this.szmallenium = szmallenium;
    }

    @Override
    public void wlozKarte() {
        System.out.println("Karta znajduje się już w bankomacie.");
    }

    @Override
    public void wprowadzPin(Karta karta) {
        System.out.println("PIN został już zweryfikowany.");
    }

    @Override
    public void wyplac() {
        System.out.println("Podaj kwotę, którą chcesz wypłacić.");
        int kwota;
        Scanner odczyt = new Scanner(System.in);
        kwota= odczyt.nextInt();

        if(szmallenium.getHajs() - kwota>=0)
        {
            szmallenium.wyplacKwote(kwota);
            szmallenium.oddajKarte();
            szmallenium.setStan(szmallenium.getStanBezKarty());
        }
        else if(szmallenium.getHajs() - kwota<0 && szmallenium.getHajs() != 0  ){
            System.out.println("Dostępna gotówka to tylko: " + szmallenium.getHajs() +". Czy chcesz wypłacić podaną kwotę? tak/nie" );
            String odpowiedz;
            Scanner odp = new Scanner(System.in);
            odpowiedz = odp.nextLine();

            if(odpowiedz.equals("tak")){
                kwota=szmallenium.getHajs();
                szmallenium.wyplacKwote(kwota);
                szmallenium.oddajKarte();
                szmallenium.setStan(szmallenium.getStanPusty());
            }
            else if(odpowiedz.equals("nie")){
                System.out.println("Zapraszamy później.");
                szmallenium.oddajKarte();
                szmallenium.setStan(szmallenium.getStanBezKarty());
            }
            else {System.out.println("Odpowiedz na pytanie.");}
            }


        }





}
