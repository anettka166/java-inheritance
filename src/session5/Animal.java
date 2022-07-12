package session5;

public class Animal {
    private String numberOfLegs;
    private String color;
    private boolean isCarnivores;
    private boolean isDomestic;
    private String name;

    public Animal(String numberOfLegs, String color, boolean isCarnivores, boolean isDomestic, String name) {
        this.numberOfLegs = numberOfLegs;
        this.color = color;
        this.isCarnivores = isCarnivores;
        this.isDomestic = isDomestic;
        this.name = name;
    }
    public void move(){
        System.out.println(name + "is moving....");
    }
    public void eat(String food){
        System.out.println(name + " is eating " + food + "...");
    }
    public void live(int years){
        System.out.println(name  + " lives for " + years + " years ");
    }
    public void sleep(int hours){
        System.out.println(name + " can seep for " + hours+ " hours");
    }

    public String getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(String numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCarnivores() {
        return isCarnivores;
    }

    public void setCarnivores(boolean carnivores) {
        isCarnivores = carnivores;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 class Wolf extends Animal{

    private int numberOfteeth;

     public Wolf(String numberOfLegs, String color, boolean isCarnivores, boolean isDomestic, String name, int numberOfTeeth) {
         super(numberOfLegs, color, isCarnivores, isDomestic, name);
         this.numberOfteeth = numberOfTeeth;
     }

     public int getNumberOfteeth() {
         return numberOfteeth;
     }

     public void setNumberOfteeth(int numberOfteeth) {
         this.numberOfteeth = numberOfteeth;
     }
 }
class Fish extends Animal {

    private int swimmingSpeed;

    public Fish(String numberOfLegs, String color, boolean isCarnivores, boolean isDomestic, String name, int swimmingSpeed) {
        super(numberOfLegs, color, isCarnivores, isDomestic, name);
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void move(){
        System.out.println(getName() + "is swimming....");
    }
}
class Bear extends Animal{
    private boolean isPolar;
    private boolean isViolent;

    public Bear(String numberOfLegs, String color, boolean isCarnivores, boolean isDomestic, String name, boolean isPolar, boolean isViolent) {
        super(numberOfLegs, color, isCarnivores, isDomestic, name);
        this.isPolar = isPolar;
        this.isViolent = isViolent;
    }

    public boolean isPolar() {
        return isPolar;
    }

    public void setPolar(boolean polar) {
        isPolar = polar;
    }

    public boolean isViolent() {
        return isViolent;
    }

    public void setViolent(boolean violent) {
        isViolent = violent;
    }
}
class Cat extends Wolf{

    public Cat(String numberOfLegs, String color, boolean isCarnivores, boolean isDomestic, String name, int numberOfTeeth) {
        super(numberOfLegs, color, isCarnivores, isDomestic, name, numberOfTeeth);
    }
}