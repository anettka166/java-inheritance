package session6;

public class Main {
    public static void main(String[] args) {

   Doctor doctor = new Doctor();
   Coach coach = new Coach();

   Person[] people = {doctor, coach};

   Person firstPerson = people [0];

   if(firstPerson instanceof Doctor) {

       ((Doctor) firstPerson).treat("With advil");

   }
    }
}
