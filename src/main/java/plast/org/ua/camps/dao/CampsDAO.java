package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.model.CampName;
import plast.org.ua.camps.pojo.Camps;
import plast.org.ua.camps.repository.CampsRepository;

@Service
public class CampsDAO {
	@Autowired
	CampsRepository campsRepository;
	
	/*save employee*/
	public Camps createCamp(Camps cmp){
		return campsRepository.save(cmp);
	}
	
	/*find  employee*/
	public List<Camps> findAllCamps(){
		return campsRepository.findAll();
	}

	/*get employee*/
	public Camps findOneCamp(Long id){
		return campsRepository.getOne(id);
		//return campsRepository.findOneCamp(cmpid);
				
	}
	/*delete employee*/
	public void delete(Camps cmp){
		campsRepository.delete(cmp);
	}
	
	public List<CampName> findSelectCamp(Long id){
		return campsRepository.findSelectCamps(id);
	}
	
//	public List<Camps> findSelectCamp(){
//		return campsRepository.findSelectCamps();
//	}

}
