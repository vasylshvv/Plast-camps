package plast.org.ua.camps.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import plast.org.ua.camps.model.CampsStanytsya;
import plast.org.ua.camps.pojo.Stanytsya;
import plast.org.ua.camps.repository.StanytsyaRepository;

@Service
public class StanytsyaDAO {
	@Autowired
	StanytsyaRepository stanytsyaRepository;
	
	public List<CampsStanytsya> findAllStanytsyaOkruha(Long id){
		return stanytsyaRepository.findStanytsyaOkruha(id);
	}
	
	public List<CampsStanytsya> findAllStanytsya(){
		return stanytsyaRepository.findAllStanytsya();
	}
	
	public Stanytsya findOneStan(Long stanid){
		return stanytsyaRepository.getOne(stanid);
	}
}
