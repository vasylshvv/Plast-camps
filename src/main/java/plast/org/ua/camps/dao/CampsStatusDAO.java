package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampStatus;
import plast.org.ua.camps.repository.CampStatusRepository;

@Service
public class CampsStatusDAO {
	@Autowired
	CampStatusRepository campStatusRepository;
	
	/*save employee*/
	public CampStatus createCampStatus(CampStatus cmps){
		return campStatusRepository.save(cmps);
	}
	
	/*find  employee*/
	public List<CampStatus> findAllCampStatus(){
		return campStatusRepository.findAll();
	}
	
	/*get employee*/
	public CampStatus findOneCampStatus(Long cmpsid){
		return campStatusRepository.getOne(cmpsid);
				
	}
	/*delete employee*/
	public void delete(CampStatus cmps){
		campStatusRepository.delete(cmps);
	}
}
