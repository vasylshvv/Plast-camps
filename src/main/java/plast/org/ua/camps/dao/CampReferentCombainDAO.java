package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampReferentCombain;
import plast.org.ua.camps.repository.CampReferentCombainRepository;

@Service
public class CampReferentCombainDAO {
	@Autowired
	CampReferentCombainRepository campReferentCombainRepository;
	
	public CampReferentCombain greateCombCampRef(CampReferentCombain campReferentCombain){
		return campReferentCombainRepository.save(campReferentCombain);
	}
	
	public void deleteCampsReferent(Long id){
		campReferentCombainRepository.deleteRefCampCombain(id);
	}
	
	public List<CampReferentCombain> findCampReferents(Long id){
		return campReferentCombainRepository.findReferent(id);
	} 
}
