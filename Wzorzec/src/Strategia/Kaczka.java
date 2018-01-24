package Strategia;


import Strategia.Kwakanie.Kwacz;
import Strategia.Kwakanie.KwakanieInterfejs;
import Strategia.Kwakanie.Piszcz;
import Strategia.Latanie.LatanieInterfejs;
import Strategia.Latanie.SzybkieLatanie;
import Strategia.Latanie.WolneLatanie;

public abstract class Kaczka {

    LatanieInterfejs latanieInterfejs;

    KwakanieInterfejs kwakanieInterfejs;

    public abstract void wyswietl();

    public String lec() {
        return latanieInterfejs.lec();
    }

    public String kwacz() {
        return kwakanieInterfejs.kwacz();
    }

    public void ustawLatanieInterfejs(LatanieInterfejs latanieInterfejs) {


        this.latanieInterfejs = latanieInterfejs;


    }

    public void ustawKwakanieInterfejs(int a) {
        switch (a) {
            case 1:
                kwakanieInterfejs = new Kwacz();
                break;
            case 2:
                kwakanieInterfejs = new Piszcz();
                break;
        }

    }


}
