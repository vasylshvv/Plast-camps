package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.model.CampsKurin;
import plast.org.ua.camps.pojo.KurinUPU;
import plast.org.ua.camps.repository.KurinRepository;

@Service
public class KurinDAO {
	@Autowired
	KurinRepository kurinRepository;
	
	public List<CampsKurin> findAllKurinStanytsya(Long idStanytsya){
		return kurinRepository.findAllKurinStanytsya(idStanytsya);
	}
	public List<CampsKurin> findAllKurin(){
		return kurinRepository.findAllKurin();
	}
	public KurinUPU findOneKurin(Long id){
		return kurinRepository.getOne(id);
	}
}
