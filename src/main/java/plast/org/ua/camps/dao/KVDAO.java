package plast.org.ua.camps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.KV;
import plast.org.ua.camps.repository.KVRepository;

@Service
public class KVDAO {
	@Autowired
	KVRepository kvRepository;
	
	public KV findOneKv(Long id){
		return kvRepository.getOne(id);
	}
}
