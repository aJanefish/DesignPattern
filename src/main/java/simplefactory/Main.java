package simplefactory;

public class Main {
    public static void main(String[] args) {
        Operate operate = SimpleFactory.create(SimpleFactory.Op.ADD);
        System.out.println(operate.getResult());
        operate = SimpleFactory.create(SimpleFactory.Op.SUB);
        System.out.println(operate.getResult());
        operate = SimpleFactory.create(SimpleFactory.Op.MUL);
        System.out.println(operate.getResult());
        operate = SimpleFactory.create(SimpleFactory.Op.DIV);
        System.out.println(operate.getResult());
    }
}
