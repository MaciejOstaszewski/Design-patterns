package Polecenie;

public class PolecenieWlaczSwiatlo implements Polecenie {
    Swiatlo swiatlo;

    public PolecenieWlaczSwiatlo(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void wykonaj() {
        swiatlo.wlacz();
    }

    @Override
    public void wycofaj() {
        swiatlo.wylacz();
    }


}
