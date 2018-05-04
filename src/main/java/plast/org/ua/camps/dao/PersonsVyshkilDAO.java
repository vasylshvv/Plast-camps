package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.PersonsVyshkil;
import plast.org.ua.camps.repository.PersonsVyshkilRepository;

@Service
public class PersonsVyshkilDAO {
	@Autowired
	PersonsVyshkilRepository personsVyshkilRepository;
	
	public PersonsVyshkil savePersonVyshkil(PersonsVyshkil persVyshkil){
		return personsVyshkilRepository.save(persVyshkil);
	}
}
