package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.Stupin;
import plast.org.ua.camps.repository.StupinRepository;

@Service
public class StupinDAO {
	@Autowired
	StupinRepository stupinRepository;
	
	public Stupin findOneStupin(Long stupinid){
		return stupinRepository.getOne(stupinid);
	}
}
