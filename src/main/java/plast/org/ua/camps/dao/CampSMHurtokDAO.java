package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampHurtokTb;
import plast.org.ua.camps.pojo.CampSMHurtok;
import plast.org.ua.camps.repository.CampSMHurtokRepository;

@Service
public class CampSMHurtokDAO {
	@Autowired
	CampSMHurtokRepository campSMHurtokRepository;
	public void deleteCampSMHurtok(Long id){
		campSMHurtokRepository.deletCampSMHurtok(id);
	}
	
	public CampSMHurtok greateCampSMHurtok(CampSMHurtok campSMHurtok){
		return campSMHurtokRepository.save(campSMHurtok);
	}
	public List<CampSMHurtok> findCampSMHurtok(Long id){
		return campSMHurtokRepository.findCampSMHurtok(id);
	}
}
