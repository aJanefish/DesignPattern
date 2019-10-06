package decorator.test;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void show(){
        System.out.format("装扮的%s\n",name);
    }
}
