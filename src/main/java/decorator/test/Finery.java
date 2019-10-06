package decorator.test;

public class Finery extends Person {
    protected Person component;

    public void Decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        //super.show();
        if (component != null) {
            component.show();
        }
    }
}
