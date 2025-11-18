package people.manager.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import people.manager.personapi.dto.request.PersonDTO;
import people.manager.personapi.dto.response.MessageResponseDTO;
import people.manager.personapi.entity.Person;
import people.manager.personapi.mapper.PersonMapper;
import people.manager.personapi.repository.PersonRepository;

@Service
public class PersonService {
   private PersonRepository personRepository;

   private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository; }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID" + savedPerson.getId())
                .build(); }

}
