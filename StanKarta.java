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


    public void wprowadzPin(int kodPin) {

        int pin;
        System.out.println("Podaj kod PIN wprowadzonej karty.");
        Scanner zczytaj = new Scanner(System.in);
        pin = zczytaj.nextInt();
        int i;
        for(i=1;i<4;i++){
        if (pin==kodPin){
            System.out.println("Podano poprawny kod PIN.");
            szmallenium.setStan(szmallenium.getStanWyplata());
            break;
        }
        if(pin!=kodPin) {
            System.out.println("Kod pin jest niepoprawny!");
            System.out.println("Liczba pozostałych prób:" + (3-i));
        }
        if(pin!=kodPin && i==3){
            szmallenium.setStan(szmallenium.getStanBlednyPin(kodPin));}
        }
    }


    public void wyplac() {
        System.out.println("Wypłata środków będzie możliwa po wprowadzeniu kodu PIN.");
    }


    public void blokujKarte() {
        System.out.println("Operacja niedozwolona.");
    }}


