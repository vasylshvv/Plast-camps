package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.Leaders;
import plast.org.ua.camps.repository.LeadersRepository;

@Service
public class LeadersDAO {
	@Autowired
	LeadersRepository leadersRepository;
	
	public Leaders findOneLeader(Long id){
		return leadersRepository.getOne(id);
	}
}
