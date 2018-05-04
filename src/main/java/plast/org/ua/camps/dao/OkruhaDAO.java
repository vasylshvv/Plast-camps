package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.Okruha;
import plast.org.ua.camps.repository.OkruhaRepository;

@Service
public class OkruhaDAO {
	@Autowired
	OkruhaRepository okruhaRepository;
	
	public List<Okruha> findAllOkruha(){
		return okruhaRepository.findAll();
	}
	
	public Okruha findOneOkruha(Long id){
		return okruhaRepository.getOne(id);
	}
}
