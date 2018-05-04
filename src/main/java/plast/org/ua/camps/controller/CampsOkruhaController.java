package plast.org.ua.camps.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import plast.org.ua.camps.dao.OkruhaDAO;
import plast.org.ua.camps.model.CampsOkruha;
import plast.org.ua.camps.pojo.Okruha;

@RestController
@RequestMapping("/plastapi")
public class CampsOkruhaController {
	
	@Autowired
	OkruhaDAO okruhaDAO;
	
	@CrossOrigin
	@GetMapping("/okruha")
	public ResponseEntity<List<CampsOkruha>> allOkruha(){
		List<Okruha> listOkruha = okruhaDAO.findAllOkruha();
		List<CampsOkruha> listCampsOkruha = new ArrayList<CampsOkruha>();
		if(listOkruha == null){
			return ResponseEntity.notFound().build();
		}
		for (Okruha okr : listOkruha) {
			CampsOkruha okruha = new CampsOkruha(okr.getId(), okr.getNameokruha());
			listCampsOkruha.add(okruha);
		}
		
		return ResponseEntity.ok().body(listCampsOkruha);
	}
}
