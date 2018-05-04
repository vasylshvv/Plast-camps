package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.model.CampsKurinUSPUPS;
import plast.org.ua.camps.pojo.KurinUSPUPS;
import plast.org.ua.camps.repository.CampsKurinUSPUPSRepository;

@Service
public class KurinUPSUPSDAO {
	@Autowired
	CampsKurinUSPUPSRepository campsKurinUSPUPSRepository;
	
	public List<CampsKurinUSPUPS> findAllKurinUSPUPS(){
		return campsKurinUSPUPSRepository.findAllKurinUSPUPS();
	}
	
	public KurinUSPUPS findOneKurinUSP(Long id){
		return campsKurinUSPUPSRepository.getOne(id);
	}
}
