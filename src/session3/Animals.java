package session3;

public class Animals {
    int numberOfLegs;
    String type;
    String color;
    boolean hasTail;
    double weight;
    String name;



    public void eat(String food) {
        System.out.println(name + "is eating " + food);
    }

    public void move() {
        System.out.println(name + "is moving ");
    }

    public void live(int years) {
        System.out.println(name + " lives for " + years + " years ");
    }
}
    class Dog extends Animals {
        String breed;
        boolean isDomestic;


        public void bark() {
            System.out.println(name + " is barking ");
        }
    }
        class Wolf extends Animals {
            boolean isWild;
        }


    class Zebra extends Animals {
        int numberofStripes;

        }

    class Fish extends Animals{
        boolean isTropical;
        boolean isNemo;


        }

    class Birds extends Animals {
        boolean canFly;


        public void fly(){

        }
    }
