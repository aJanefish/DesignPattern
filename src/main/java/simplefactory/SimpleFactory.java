package simplefactory;

/**
 * 设计模式
 * 可维护
 * 可扩展
 * 可复用
 * 灵活性好
 * 简单工厂模式
 */
public class SimpleFactory {
    public static Operate create(Op op) {
        Operate operate = null;
        switch (op) {
            case ADD:
                operate = new OperateAdd();
                break;
            case SUB:
                operate = new OperateSub();
                break;
            case MUL:
                operate = new OperateMul();
                break;
            case DIV:
                operate = new OperateDiv();
                break;
            default:
                System.out.println("Op is not define:" + op);
                break;
        }
        return operate;
    }

    public static enum Op {
        ADD, SUB, MUL, DIV;
    }
}
