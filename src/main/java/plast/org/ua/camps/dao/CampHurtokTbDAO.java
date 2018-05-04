package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampHurtokTb;
import plast.org.ua.camps.pojo.CampStanytsyaTb;
import plast.org.ua.camps.repository.CampHurtokTbRepository;

@Service
public class CampHurtokTbDAO {
	@Autowired
	CampHurtokTbRepository campHurtokTbRepository;
	public void deleteCampHurtokTb(Long id){
		campHurtokTbRepository.deletCampHurtokTb(id);
	}
	
	public CampHurtokTb greateCampHurtokTb(CampHurtokTb campHurtokTb){
		return campHurtokTbRepository.save(campHurtokTb);
	}
	public List<CampHurtokTb> findCampHurtokTb(Long id){
		return campHurtokTbRepository.findCampHurtokTb(id);
	}
}
