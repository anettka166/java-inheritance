package session6;

import org.w3c.dom.ls.LSOutput;

public class Person {
    public String name;

    public void speak(String language) {
        System.out.println("Person speaks " + language);
    }
}
class Doctor extends Person{
    public void treat(String pill){
        System.out.println("Doctor recommends" + pill);
    }

}

class Coach extends Person{
    public void train(int numberOfPeople){
        System.out.println("Coach trains " + numberOfPeople);
    }
}

