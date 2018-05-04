package plast.org.ua.camps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import plast.org.ua.camps.dao.StanytsyaDAO;
import plast.org.ua.camps.model.CampsStanytsya;


@RestController
@RequestMapping("/plastapi")
public class CampsStanytsyaController {
	
	@Autowired
	StanytsyaDAO stanytsyaDAO;
	
	@CrossOrigin
	@GetMapping("/okruha/{okruhaID}/stanytsya")
	public ResponseEntity<List<CampsStanytsya>> getAllStanytsyaOkruha(@PathVariable(value="okruhaID") Long okruhaID){
		List<CampsStanytsya> listCampsStanytsya = stanytsyaDAO.findAllStanytsyaOkruha(okruhaID);
		if(listCampsStanytsya == null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(listCampsStanytsya);
	}
	
	@CrossOrigin
	@GetMapping("/stanytsya")
	public ResponseEntity<List<CampsStanytsya>> getAllStanytsya(){
		List<CampsStanytsya> listCampsStanytsya = stanytsyaDAO.findAllStanytsya();
		if(listCampsStanytsya == null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(listCampsStanytsya);
	}
}
