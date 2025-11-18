package people.manager.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import people.manager.personapi.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
