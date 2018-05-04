package plast.org.ua.camps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plast.org.ua.camps.pojo.CampsKurinStPl;
import plast.org.ua.camps.repository.CampsKurinStPlRepository;

@Service
public class CampsKurinStPlDAO {
	@Autowired
	CampsKurinStPlRepository campsKurinStPlRepository;
	
	public void deleteCampKurinUsp(Long id){
		campsKurinStPlRepository.deleteCampsKurinStPl(id);
	}
	
	public CampsKurinStPl greateCampsKurinStPl(CampsKurinStPl campsKurinStPl){
		return campsKurinStPlRepository.save(campsKurinStPl);
	}
	public List<CampsKurinStPl> findKurinstpl(Long id){
		return campsKurinStPlRepository.findCampsKurinStPl(id);
	}
}
