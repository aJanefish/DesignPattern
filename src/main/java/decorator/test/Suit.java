package decorator.test;

public class Suit extends Finery {
    @Override
    public void show() {
        System.out.println("皮鞋");
        super.show();
    }
}
