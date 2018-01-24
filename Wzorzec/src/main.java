import Dekorator.AbstractProduct;
import Dekorator.Oliwki;
import Dekorator.Pizza;
import Dekorator.Ser;
import Polecenie.*;
import Strategia.DzikaKaczka;
import Strategia.GumowaKaczka;
import Strategia.Kaczka;
import Strategia.Latanie.SzybkieLatanie;

public class main {
    public static void main(String [] agrs){
//        Singleton singleton = Singleton.getInstance();
//        System.out.println(singleton.text());


//        AbstractProduct pizza;
//
//        pizza = new Pizza();
//        pizza = new Ser(pizza);
//        pizza = new Ser(pizza);
//        pizza = new Oliwki(pizza);
//
//        System.out.println(pizza);


        Kaczka gumowa = new GumowaKaczka();
        gumowa.ustawKwakanieInterfejs(2);
        gumowa.ustawLatanieInterfejs(new SzybkieLatanie());
        gumowa.wyswietl();
        System.out.println(gumowa.kwacz());
        System.out.println(gumowa.lec());
        Kaczka dzika = new DzikaKaczka();
       // dzika.ustawLatanieInterfejs(1);
        dzika.wyswietl();
        System.out.println(dzika.lec());
        System.out.println(dzika.kwacz());


//        Polecenie[] polecenieWlacz;
//        Polecenie[] polecanieWylacz;
//        Polecenie polecenieWycofaj;
//
//        polecanieWylacz = new Polecenie[7];
//        polecenieWlacz = new Polecenie[7];
//
//        Swiatlo swiatlo = new Swiatlo();
//        polecanieWylacz[0] = new PolecenieWylaczSwiatlo(swiatlo);
//        polecenieWlacz[0] = new PolecenieWlaczSwiatlo(swiatlo);
//
//
//
//
//        polecenieWlacz[0].wykonaj();
//        polecanieWylacz[0].wykonaj();
//        polecenieWlacz[0].wykonaj();
//        polecenieWycofaj = polecanieWylacz[0];
////        polecenieWycofaj = polecenieWlacz[0];
//        polecenieWycofaj.wykonaj();
//        polecenieWycofaj.wykonaj();
////        polecenieWycofaj.wycofaj();
//
//        WiezaStereo wiezaStereo = new WiezaStereo();
//
//        polecenieWlacz[1] = new PolecenieWiezaStereoWlaczCD(wiezaStereo);
//
//        polecenieWlacz[1].wykonaj();



    }

}
