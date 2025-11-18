package people.manager.personapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import people.manager.personapi.dto.MessageResponseDTO;
import people.manager.personapi.entity.Person;
import people.manager.personapi.service.PersonService;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson (@RequestBody Person person) {
        return  personService.createPerson(person);

    }
}
