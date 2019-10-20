package component;

public class FinanceDepartment extends Company{

    public FinanceDepartment(String name) {
        super(name);
    }

    public void add(Company c) {

    }

    public void remove(Company c) {

    }

    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    public void lineOfDuty() {
        System.out.println(name+" 公司财务收支管理");

    }
}
