package decorator.test;

public class LeatherShoes extends Finery {
    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}
