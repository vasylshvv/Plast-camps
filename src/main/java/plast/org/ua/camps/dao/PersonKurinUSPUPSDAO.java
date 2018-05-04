package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.PersonKurinUSPUPS;
import plast.org.ua.camps.repository.PersonKurinUSPUPSRepository;

@Service
public class PersonKurinUSPUPSDAO {
	@Autowired
	PersonKurinUSPUPSRepository personKurinUSPUPSRepository;
	
	public PersonKurinUSPUPS savePersonKurinUSP(PersonKurinUSPUPS perskurusp){
		return personKurinUSPUPSRepository.save(perskurusp);
	}
}
