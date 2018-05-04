package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampKurinTb;
import plast.org.ua.camps.pojo.CampOkruhaTb;
import plast.org.ua.camps.repository.CampKurinTbRepository;

@Service
public class CampKurinTbDAO {
	@Autowired
	CampKurinTbRepository campKurinTbRepository;
	
	public void deleteCampKurinTb(Long id){
		campKurinTbRepository.deleteCampKurinTb(id);
	}
	
	public CampKurinTb greateCampKurinTb(CampKurinTb campKurinTb){
		return campKurinTbRepository.save(campKurinTb);
	}
	public List<CampKurinTb> findCampKurinTb(Long id){
		return campKurinTbRepository.findCampKurinTb(id);
	}
}
