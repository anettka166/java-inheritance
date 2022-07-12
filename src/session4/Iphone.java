package session4;

public class Iphone extends Phone{
    private String color;
    private String madeIn;

    public Iphone(String model, String brand, boolean isTouchScreen, boolean is5G, int capacity, String color, String madeIn) {
        super(model, brand, isTouchScreen, is5G, capacity);
        this.color = color;
        this.madeIn = madeIn;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

   @Override
    public String toString() {
        return "Iphone{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", isTouchScreen=" + isTouchScreen() +
                ", is5G=" + isIs5G() +
                ", capacity=" + getCapacity() +
                ", os=" + getColor() +
                '}';

    }
}
