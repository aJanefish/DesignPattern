package decorator.test;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("wxf");

        System.out.println("第一种装扮");

        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        sneakers.Decorate(person);
        bigTrouser.Decorate(sneakers);
        tShirts.Decorate(bigTrouser);
        tShirts.show();

        System.out.println("第二种装扮");
        LeatherShoes leatherShoes = new LeatherShoes();
        Tie tie = new Tie();
        Suit suit = new Suit();
        leatherShoes.Decorate(person);
        tie.Decorate(leatherShoes);
        suit.Decorate(tie);

        suit.show();


        System.out.println("第三种装扮");

        sneakers.Decorate(person);
        leatherShoes.Decorate(sneakers);
        bigTrouser.Decorate(leatherShoes);
        tie.Decorate(bigTrouser);
        tie.show();
    }
}
