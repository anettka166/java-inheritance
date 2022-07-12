package session5;

public class OurZoo {
    public static void main(String[] args) {


        Wolf wolf = new Wolf("4", "grey", true, false, "Arctic Wolf", 42);
        Fish fish = new Fish("0", "multicolor", false, false, "Salmon", 2);
        Bear bear = new Bear("2", "Brown", true, false, "Cave Bear", false, true);
        Cat cat = new Cat("4", "Grey", true, true, "Cat", 18);
        Animal[] animals = {wolf, fish, bear, cat};


        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            animal.move();
            if(animal instanceof Wolf){
                animal.live(25);
            }else if(animal instanceof Fish){
                animal.live(5);
            } else if (animal instanceof Bear) {

                animal.live(30);
            }else{
                animal.live(10);
            }
        }


    }


}







