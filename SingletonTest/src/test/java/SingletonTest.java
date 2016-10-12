import bogdangud.sigletontest.Person;
import org.junit.Assert;
import org.junit.Test;
public class SingletonTest {

    @Test
    public  void IsSingletonInstancesEquals() {
        Person person = Person.getInstance("Jim", 25);
        Person person1 = Person.getInstance("Bob", 30);
        Assert.assertTrue(person.equals(person1));

        person.setAge(40);
        Assert.assertEquals(person.getAge(), person1.getAge());
    }
    @Test
    public  void IsSingletonInstancesPropertiesEquals() {
        Person person = Person.getInstance("Jim", 25);
        Person person1 = Person.getInstance("Bob", 30);
        person.setAge(40);
        Assert.assertEquals(person.getAge(), person1.getAge());
        Assert.assertEquals(40, person1.getAge());
    }



}
