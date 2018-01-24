package Dekorator;

public class Ser extends AbstractProductDecorator {
    public Ser(AbstractProduct abstractProduct) {
        super(abstractProduct);
    }

    @Override
    public String decsription() {
        return abstractProduct.decsription() + " + Ser";
    }

    @Override
    public double price() {
        return abstractProduct.price() + 2;
    }
}
