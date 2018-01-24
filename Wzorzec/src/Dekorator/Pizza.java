package Dekorator;

public class Pizza extends AbstractProduct {
    @Override
    public String decsription() {
        return "Pizza";
    }

    @Override
    public double price() {
        return 12;
    }
}
