package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Person;

// here we define it as a local interface

@Local
public interface PersonService {
    
    List<Person> personList();
    
    Person findPersonById(Person person);
    
    Person findPersonByEmail(Person person);
    
    void createPerson(Person person);
    
    void modifyPerson(Person person);
    
    void deletePerson(Person person);
    
}
