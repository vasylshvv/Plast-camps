package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampsReferents;
import plast.org.ua.camps.repository.CampsReferentsRepository;

@Service
public class CampsReferentsDAO {
	@Autowired
	CampsReferentsRepository campsReferentsRepository;
	public CampsReferents createReferents(CampsReferents campref){
		return campsReferentsRepository.save(campref);
	}
	
	public List<CampsReferents> findAllReferents(){
		return campsReferentsRepository.findAll();
	}
	
	public CampsReferents findOneReferents(Long id){
		return  campsReferentsRepository.getOne(id);
	}
}
