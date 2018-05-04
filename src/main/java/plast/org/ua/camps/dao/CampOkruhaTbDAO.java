package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampOkruhaTb;
import plast.org.ua.camps.pojo.CampsKurinStPl;
import plast.org.ua.camps.repository.CampOkruhaTbRepository;
import plast.org.ua.camps.repository.CampsKurinStPlRepository;

@Service
public class CampOkruhaTbDAO {
	@Autowired
	CampOkruhaTbRepository campOkruhaTbRepository;
	
	public void deleteCampOkruhaTb(Long id){
		campOkruhaTbRepository.deletCampOkruhaTb(id);
	}
	
	public CampOkruhaTb greateCampOkruhaTb(CampOkruhaTb campOkruhaTb){
		return campOkruhaTbRepository.save(campOkruhaTb);
	}
	public List<CampOkruhaTb> findCampOkruhaTb(Long id){
		return campOkruhaTbRepository.findCampOkruhaTb(id);
	}
}
