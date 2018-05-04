package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.PersonsKV;
import plast.org.ua.camps.repository.PersonsKVRepository;

@Service
public class PersonsKVDAO {
	@Autowired
	PersonsKVRepository kvRepository;
	
	public PersonsKV savePersonsKV(PersonsKV personsKV){
		return kvRepository.save(personsKV);
	}
}
