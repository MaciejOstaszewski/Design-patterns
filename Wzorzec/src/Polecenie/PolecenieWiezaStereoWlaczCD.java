package Polecenie;

public class PolecenieWiezaStereoWlaczCD implements Polecenie {
    WiezaStereo wiezaStereo;

    public PolecenieWiezaStereoWlaczCD(WiezaStereo wiezaStereo) {
        this.wiezaStereo = wiezaStereo;
    }

    @Override
    public void wykonaj() {
        wiezaStereo.wlacz();
        wiezaStereo.ustwaCD();
        wiezaStereo.ustawGloscnosc(3);
    }

    @Override
    public void wycofaj() {
        wiezaStereo.wylacz();
    }
}
