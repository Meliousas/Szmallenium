/**
 * Created by Melious on 03.06.2016.
 */
public class SzmalleniumTest {

   public static void main(String[] args){
       Szmallenium szmallenium = new Szmallenium(1000000);
       Karta karta= new Karta(1111);

       szmallenium.wlozKarte();
       szmallenium.wprowadzPin(karta);
       szmallenium.wyplac();



}
}
