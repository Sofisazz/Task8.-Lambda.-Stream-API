import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {

    public int compare(Person a, Person b) {
        return a.getSurname().compareTo(b.getSurname());
    }
  }
