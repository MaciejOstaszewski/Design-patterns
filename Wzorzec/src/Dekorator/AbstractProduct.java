package Dekorator;

public abstract class AbstractProduct {

    public abstract String decsription();

    public abstract double price();

    @Override
    public String toString() {
        return "Cena - " + price() + "  " + decsription();
    }
}
