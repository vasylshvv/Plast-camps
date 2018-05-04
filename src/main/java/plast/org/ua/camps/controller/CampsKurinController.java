package plast.org.ua.camps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import plast.org.ua.camps.dao.HurtokDAO;
import plast.org.ua.camps.dao.KurinDAO;
import plast.org.ua.camps.dao.KurinUPSUPSDAO;
import plast.org.ua.camps.model.CampsHurtok;
import plast.org.ua.camps.model.CampsKurin;
import plast.org.ua.camps.model.CampsKurinUSPUPS;

@RestController
@RequestMapping("/plastapi")
public class CampsKurinController {
	
	@Autowired
	KurinDAO kurinDAO;
	
	@Autowired
	HurtokDAO hurtokDAO;
	
	@Autowired
	KurinUPSUPSDAO kurinUPSUPSDAO;
	
	@CrossOrigin
	@GetMapping("/stanytsya/{stanytsyaID}/kurin")
	public ResponseEntity<List<CampsKurin>> getAllKurinStanytsya(@PathVariable("stanytsyaID") Long stanytsyaID){
		List<CampsKurin> listCampsKurin = kurinDAO.findAllKurinStanytsya(stanytsyaID);
		if(listCampsKurin == null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(listCampsKurin);
	}
	
	@CrossOrigin
	@GetMapping("/kurin")
	public ResponseEntity<List<CampsKurin>> getAllKurin(){
		List<CampsKurin> listCampsKurin = kurinDAO.findAllKurin();
		if(listCampsKurin == null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(listCampsKurin);
	}
	
	@CrossOrigin
	@GetMapping("/kureniusp")
	public ResponseEntity<List<CampsKurinUSPUPS>> getAllKurinUSPUPS(){
		List<CampsKurinUSPUPS> listCampsKurin = kurinUPSUPSDAO.findAllKurinUSPUPS();
		if(listCampsKurin == null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(listCampsKurin);
	}
	
	@CrossOrigin
	@GetMapping("/kurin/{kurinID}/hurtky")
	public ResponseEntity<List<CampsHurtok>> getAllHurtokKurin(@PathVariable("kurinID") Long kurinID){
		List<CampsHurtok> listHurtok = hurtokDAO.findAllHurtokInKurin(kurinID);
		if(listHurtok == null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(listHurtok);
	}
}
