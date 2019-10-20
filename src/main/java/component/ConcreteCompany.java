package component;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    public void add(Company c) {
        children.add(c);
    }

    public void remove(Company c) {
        children.remove(c);
    }

    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Company c : children) {
            c.display(depth + 2);
        }
    }

    public void lineOfDuty() {
        for (Company c : children) {
            c.lineOfDuty();
        }
    }
}
