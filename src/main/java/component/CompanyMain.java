package component;

public class CompanyMain {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("北京总公司人力资源部"));
        root.add(new FinanceDepartment("北京总公司财务资源部"));


        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("上海华东分公司人力资源部"));
        comp.add(new FinanceDepartment("上海华东分公司财务资源部"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务资源部"));
        comp.add(comp1);


        ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HRDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财务资源部"));
        comp.add(comp2);

        root.display(1);
        root.lineOfDuty();
    }
}
