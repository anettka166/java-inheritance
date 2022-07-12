package session1;

public class Main {

    public static void main(String[] args) {
        Grandparent grandparent = new Grandparent();
        System.out.println("--------Grandparent-------");
        grandparent.name = "Lee";
        grandparent.money = 1200000;
        grandparent.house = "Beautiful House";

        System.out.println(grandparent.name);
        System.out.println(grandparent.money);
        System.out.println(grandparent.house);

        System.out.println("------------CHILD---------------");

        Child child = new Child();
        child.name = "Kelay";
        child.money = 25000;
        child.house = "Has a brand new house";
        System.out.println(child);
    }


}
