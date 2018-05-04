package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.model.CampsHurtok;
import plast.org.ua.camps.pojo.HurtokUPU;
import plast.org.ua.camps.repository.HurtokRepository;

@Service
public class HurtokDAO {
	@Autowired
	HurtokRepository hurtokRepository;
	
	public List<CampsHurtok> findAllHurtokInKurin(Long kurinID){
		return hurtokRepository.findAllHurtokKurin(kurinID);
	}
	public HurtokUPU findOneHurtok(Long id){
	return hurtokRepository.getOne(id);
	}
}
