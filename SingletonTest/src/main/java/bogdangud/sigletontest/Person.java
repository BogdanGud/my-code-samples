package bogdangud.sigletontest;


public class Person {
    private static Person instance;
    String name;
    int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static Person getInstance(String name, int age) {
        if (instance == null) {
            instance = new Person(name, age);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
