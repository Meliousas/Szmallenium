/**s on 03.06.2016.
 */
import java.util.Scanner;

public class StanKarta implements Stan {
    Szmallenium szmallenium;

    public StanKarta(Szmallenium szmallenium) {
        this.szmallenium = szmallenium;
    }


    public void wlozKarte() {
        System.out.println("Karta znajduje się już w bankomacie.");
    }


    public void wprowadzPin(Karta karta) {

        int i;
        for(i=1;i<4;i++){

        int pin;
        System.out.println("Podaj kod PIN wprowadzonej karty.");
        Scanner zczytaj = new Scanner(System.in);
        pin = zczytaj.nextInt();

        if (karta.kodPin == pin){
            System.out.println("Podano poprawny kod PIN.");
            szmallenium.setStan(szmallenium.getStanWyplata());
            break;
        }
        if(karta.kodPin != pin) {
            System.out.println("Kod pin jest niepoprawny!");
            System.out.println("Liczba pozostałych prób:" + (3-i));
        }
        if(karta.kodPin != pin && i==3){
            szmallenium.blokujKarte(karta);
            szmallenium.oddajKarte();
            szmallenium.setStan(szmallenium.getStanBezKarty());}
        }
    }


    public void wyplac() {
        System.out.println("Wypłata środków będzie możliwa po wprowadzeniu kodu PIN.");
    }


    }


