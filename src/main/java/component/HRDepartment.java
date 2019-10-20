package component;

public class HRDepartment extends Company {
    public HRDepartment(String name) {
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
        System.out.println(name+" 员工招聘培训管理");
    }
}
