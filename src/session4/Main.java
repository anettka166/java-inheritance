package session4;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Iphone thirteen = new Iphone("Iphone 13", "Apple",true,
                true,250, "Gold"," China");

        thirteen.sendMessage("111-333-7878", "Hi there");

        System.out.println(thirteen);
        thirteen.call("258-852-9878");
        System.out.println(thirteen.getBrand());
        System.out.println(thirteen.getBrand());
        System.out.println(thirteen.isIs5G());

        thirteen.setColor("blue");
        System.out.println(thirteen.getColor());

        System.out.println("Welcome to phone factory!");
        System.out.println("What kind of phone would you like?");
        System.out.println("samsung | iPhone");
        System.out.println("Yor option:");
Scanner scanner = new Scanner(System.in);
String option  = scanner.nextLine().toLowerCase();//samsung

        switch(option) {
            case "samsung":{
                System.out.println("Let's build your Samsung!");
                System.out.print("model:");
                String model = scanner.nextLine();
                System.out.print("brand: ");
                String brand = scanner.nextLine();
                System.out.print("Touchsceen? (true/false) ");
                boolean touchscreen = scanner.nextBoolean();
                System.out.print("5G? (true/false)");
                boolean fiveG = scanner.nextBoolean();
                System.out.print("Capacity?: ");
                int capacity = Integer.parseInt(scanner.nextLine());
                System.out.print("OS: ");
                String os = scanner.nextLine();
                Samsung samsung = new Samsung(model, brand, touchscreen, fiveG, capacity, os);
                System.out.println("Your phone is ready:");
                System.out.println(samsung);
        }
                break;
            case "iphone": {
            System.out.println("Let's build your Iphone!");
            System.out.print("model:");
            String model = scanner.nextLine();
            System.out.print("brand: ");
            String brand = scanner.nextLine();
            System.out.print("Touchsceen? (true/false) ");
            boolean touchscreen = scanner.nextBoolean();
            System.out.print("5G? (true/false)");
            boolean fiveG = scanner.nextBoolean();
            System.out.print("Capacity?: ");
            int capacity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            Iphone iphone = new Iphone(model, brand, touchscreen, fiveG, capacity, color, "China");
            System.out.println("your phone is ready:");
            System.out.println(iphone);
        }
                break;

            default: {
            System.out.println("Invalid phone type");
        }
        }






    }
}
