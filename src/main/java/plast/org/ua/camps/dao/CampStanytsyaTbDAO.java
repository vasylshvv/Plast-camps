package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampOkruhaTb;
import plast.org.ua.camps.pojo.CampStanytsyaTb;
import plast.org.ua.camps.repository.CampStanytsyaTbRepository;

@Service
public class CampStanytsyaTbDAO {
	@Autowired
	CampStanytsyaTbRepository campStanytsyaTbRepository;
	public void deleteCampStanytsyaTb(Long id){
		campStanytsyaTbRepository.deletCampStanytsyaTb(id);
	}
	
	public CampStanytsyaTb greateCampStanytsyaTb(CampStanytsyaTb campStanytsyaTb){
		return campStanytsyaTbRepository.save(campStanytsyaTb);
	}
	public List<CampStanytsyaTb> findCampStanytsyaTb(Long id){
		return campStanytsyaTbRepository.findCampStanytsyaTb(id);
	}
}
