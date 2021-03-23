package Chapter17Practice;

import java.util.List;
import java.util.function.Predicate;

public class FindingFirstPerson {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Albert", "Einstein"),
                new Person("William", "Jones"),
                new Person("Peter", "Jones"),
                new Person("Larissa", ""),
                new Person("Thomas", "Jones."));

        Predicate<Person> lastName =
                person -> person.getLastName().equals("Jones");

        System.out.println(persons.stream().
                //filter(person -> person.getLastName().equals("Jones")).
                filter(lastName).
                findFirst().
                get()
        );
    }
}