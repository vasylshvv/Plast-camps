package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.Ulad;
import plast.org.ua.camps.repository.UladRepository;

@Service
public class UladDAO {
	@Autowired
	UladRepository uladRepository;
	
	/*save employee*/
	public Ulad createUlad(Ulad u){
		return uladRepository.save(u);
	}
	
	/*find  employee*/
	public List<Ulad> findAllUlad(){
		return uladRepository.findAll();
	}
	
	public List<Ulad> findFewUlad(Iterable<Long> id){
		return uladRepository.findAllById(id);
	}
	
	/*get employee*/
	public Ulad findUladOne(Long uid){
		return uladRepository.getOne(uid);
				
	}
	
	
	/*delete employee*/
	public void delete(Ulad u){
		uladRepository.delete(u);
		
	}
	
}
