package Dekorator;

public abstract class AbstractProductDecorator extends AbstractProduct {

    protected AbstractProduct abstractProduct;

    public AbstractProductDecorator(AbstractProduct abstractProduct) {
        this.abstractProduct = abstractProduct;
    }



}
