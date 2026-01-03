import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        var people = new ArrayList<Person>();

        for (int i = 1; i < 101; i++) {
            people.add(new Person("Person " + i, "Surname person " + i, new Random().nextInt(15) + 15));
        }

        List<String> res = people.stream()
                .filter(p -> p.getAge() < 21)
                .peek(p -> System.out.println(p.getName() + ' ' + p.getSurname() + " Age: " + p.getAge()))
                .sorted(new PersonSurnameComparator().thenComparing(new PersonNameComparator()))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());
    }
}