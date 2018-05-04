package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.PositionCamp;
import plast.org.ua.camps.repository.PositionCampRepository;

@Service
public class PositionCampDAO {
	@Autowired
	PositionCampRepository positionCampRepository;
	
	public PositionCamp createPosition(PositionCamp positionCamp){
		return positionCampRepository.save(positionCamp);
	}
	
	public void deletePosition(Long id){
		positionCampRepository.deletePosition(id);
	}
	
	public PositionCamp findOnePosition(Long id){
		return positionCampRepository.findPositionCamp(id);
	} 
}
