package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampGender;
import plast.org.ua.camps.repository.CampGenderRepository;

@Service
public class CampGenderDAO {
	@Autowired
	CampGenderRepository genderRepository;
	
	public List<CampGender> findAllGender(){
		return genderRepository.findAll();
	}
	
	public CampGender findOnrGender(Long id){
		return genderRepository.getOne(id);
	}
}
