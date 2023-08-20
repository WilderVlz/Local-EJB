package mx.com.gm.sga.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mx.com.gm.sga.domain.Person;

//define this class as a EJB 
@Stateless
public class PersonServiceIMPL implements PersonService {

    @Override
    public List<Person> personList() {
        
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1, "Wilder", "Ruiz", "wilderruizrpg@gmail.com", "3243289156"));

        return persons;
    }

    @Override
    public Person findPersonById(Person person) {
        return null;
    }

    @Override
    public Person findPersonByEmail(Person person) {
        return null;
    }

    @Override
    public void createPerson(Person person) {
    }

    @Override
    public void modifyPerson(Person person) {
    }

    @Override
    public void deletePerson(Person person) {
    }
}
