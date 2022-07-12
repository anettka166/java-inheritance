package session1;
//we have established Parent-child relationship between
// Class Child and Class Grandparent
public class Child extends Grandparent {
    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", house='" + house + '\'' +
                '}';
    }
}
