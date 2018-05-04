package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.PersonStupinUlad;
import plast.org.ua.camps.repository.PersonStupinRepository;

@Service
public class PersonStupinDAO {
	@Autowired
	PersonStupinRepository personStupinRepository;
	
	public PersonStupinUlad saveStupinUlad(PersonStupinUlad stupinUlad){
		return personStupinRepository.save(stupinUlad);
	}
}
