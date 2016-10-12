package bogdangud.sigletontest;


public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance("Bob", 20);
        System.out.println(person);
        Person person1 = Person.getInstance("Bil", 30);
        System.out.println(person1);



    }


}
