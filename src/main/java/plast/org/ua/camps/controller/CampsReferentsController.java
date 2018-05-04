package plast.org.ua.camps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import plast.org.ua.camps.dao.CampsReferentsDAO;
import plast.org.ua.camps.pojo.CampsReferents;

@RestController
@RequestMapping("/plastapi")
public class CampsReferentsController {
	
	@Autowired
	CampsReferentsDAO campsRefDao;
	
//	@CrossOrigin
//	@GetMapping("/referentura")
//	public List<CampsReferents> allCampsReferents(){
//		return campsRefDao.findAllReferents();
//	}
	
	@CrossOrigin
	@GetMapping("/referentura")
	public ResponseEntity<List<CampsReferents>> allCampsReferents(){
		List<CampsReferents> campref = campsRefDao.findAllReferents();
		if(campref == null){
			return ResponseEntity.notFound().build();
			
		}
		return ResponseEntity.ok().body(campref);
	}
}
