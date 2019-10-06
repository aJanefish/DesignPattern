package decorator.test;

public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
