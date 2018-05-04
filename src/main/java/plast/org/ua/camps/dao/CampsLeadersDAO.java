package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampsLeaders;
import plast.org.ua.camps.repository.CampsLeadersRepository;

@Service
public class CampsLeadersDAO {
	@Autowired
	CampsLeadersRepository campsLeadersRepository;
	
	public CampsLeaders createCampsLeader(CampsLeaders leaders){
		return campsLeadersRepository.save(leaders);
	}
	
	public void deleteLeaders(Long id){
		campsLeadersRepository.deleteLeaders(id);
	}
	
	public List<CampsLeaders> findCampsLeader(Long id){
		return campsLeadersRepository.findCampLeaders(id);
	}
}
