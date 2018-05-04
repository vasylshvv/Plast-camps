package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.PersonVyshkilTabir;
import plast.org.ua.camps.repository.PersonVyshkilTabirRepository;

@Service
public class PersonVyshkilTabirDAO {
	@Autowired
	PersonVyshkilTabirRepository personVyshkilTabirRepository;
	
	public PersonVyshkilTabir savePersonVyshkilTabir(PersonVyshkilTabir personVyshkilTabir){
		return personVyshkilTabirRepository.save(personVyshkilTabir);
	} 
}
