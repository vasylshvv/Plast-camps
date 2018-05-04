package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.VyshkilTabir;
import plast.org.ua.camps.repository.VyshkilTabirRepository;

@Service
public class VyshkilTabirDAO {
	@Autowired
	VyshkilTabirRepository vyshkilTabirRepository;
	
	public VyshkilTabir findOneVyshkilTabir(Long id){
		return vyshkilTabirRepository.getOne(id);
	}
}
