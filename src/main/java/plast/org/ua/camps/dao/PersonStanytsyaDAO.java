package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.PersonsStanytsya;
import plast.org.ua.camps.repository.PersonsStanytsyaRepository;

@Service
public class PersonStanytsyaDAO {
	@Autowired
	PersonsStanytsyaRepository personsStanytsyaRepository;
	
	public PersonsStanytsya addPersonStan(PersonsStanytsya personsStanytsya){
		return personsStanytsyaRepository.save(personsStanytsya);
	}
}
