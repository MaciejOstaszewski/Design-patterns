package Dekorator;

public class Oliwki extends AbstractProductDecorator {
    public Oliwki(AbstractProduct abstractProduct) {
        super(abstractProduct);
    }

    @Override
    public String decsription() {
        return abstractProduct.decsription() + " + oliwki";
    }

    @Override
    public double price() {
        return abstractProduct.price() + 1;
    }
}
