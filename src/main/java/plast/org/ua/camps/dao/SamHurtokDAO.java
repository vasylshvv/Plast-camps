package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.model.CampsSamHurtok;
import plast.org.ua.camps.pojo.SamHurtokUPU;
import plast.org.ua.camps.repository.SamHurtokRepository;

@Service
public class SamHurtokDAO {
	@Autowired
	SamHurtokRepository samHurtokRepository;
	
	public List<CampsSamHurtok> finAllSMHurtokStan(Long stanid){
		return samHurtokRepository.findAllSamHurtokStan(stanid);
	}
	public SamHurtokUPU findOneSMHurtok(Long id){
		return samHurtokRepository.getOne(id);
	}
}
