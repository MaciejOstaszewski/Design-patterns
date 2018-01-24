package Polecenie;

public class PolecenieWylaczSwiatlo implements Polecenie {
    Swiatlo swiatlo;

    public PolecenieWylaczSwiatlo(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        swiatlo.wylacz();
    }

    @Override
    public void wycofaj() {
        swiatlo.wlacz();
    }
}
