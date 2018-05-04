package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.Camps;
import plast.org.ua.camps.pojo.CampsUlad;
import plast.org.ua.camps.repository.CampsUladRepository;

@Service
public class CampsUladDAO {
	@Autowired
	CampsUladRepository campsUladRepository;
	
	/*save*/
	public CampsUlad creatCampUlad(CampsUlad ulad){
		return campsUladRepository.save(ulad);
	}
	
	public List<CampsUlad> findCampUlad(Long id){
		return campsUladRepository.findCampUlad(id);
	}
	public void deleteCampsUlad(Long id){
		campsUladRepository.deletCampsUlad(id);
	}
	
}
