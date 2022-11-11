import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personList;

    public Room() {
        personList = new ArrayList<Person>();
    }

    public void add(Person personToAdd) {
        personList.add(personToAdd);
    }

    public boolean isEmpty() {

        if (personList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {
        if (personList.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.personList.get(0);
        for (Person person : personList) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        if (personList.isEmpty()) {
            return null;
        }

        Person shortestPerson = shortest();
        personList.remove(shortestPerson);
        return shortestPerson;

    }
}
