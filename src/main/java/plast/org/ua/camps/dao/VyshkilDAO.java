package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.Vyshkil;
import plast.org.ua.camps.repository.VyshkilRepository;

@Service
public class VyshkilDAO {
	@Autowired
	VyshkilRepository vyshkilRepository;
	
	public Vyshkil findOneVyshkil(Long id){
		return vyshkilRepository.getOne(id);
	}
}
