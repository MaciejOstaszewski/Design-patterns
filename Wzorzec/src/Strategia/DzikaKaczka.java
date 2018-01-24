package Strategia;

import Strategia.Kwakanie.Kwacz;
import Strategia.Latanie.SzybkieLatanie;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new SzybkieLatanie();
    }

    @Override
    public void wyswietl() {
        System.out.println("dzika");
    }
}
