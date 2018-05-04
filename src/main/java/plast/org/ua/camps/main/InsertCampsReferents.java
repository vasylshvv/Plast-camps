package plast.org.ua.camps.main;

import org.springframework.beans.factory.annotation.Autowired;

import plast.org.ua.camps.dao.CampsReferentsDAO;
import plast.org.ua.camps.pojo.CampsReferents;

public class InsertCampsReferents {

	@Autowired
	CampsReferentsDAO referentsDAO;
	
	
	
	public void addReferents(){
		CampsReferents cr = new CampsReferents();
		cr.setName("Альпінізм та скелелазіння");
		referentsDAO.createReferents(cr);
		cr.setName("Велосипедна");
		referentsDAO.createReferents(cr);
		cr.setName("Військова");
		referentsDAO.createReferents(cr);
		cr.setName("Екологічна");
		referentsDAO.createReferents(cr);
		cr.setName("Етнографічна");
		referentsDAO.createReferents(cr);
		cr.setName("Кінна");
		referentsDAO.createReferents(cr);
		cr.setName("Летунська");
		referentsDAO.createReferents(cr);
		cr.setName("Мандрівництво");
		referentsDAO.createReferents(cr);
		cr.setName("Мистецька");
		referentsDAO.createReferents(cr);
		cr.setName("Морська");
		referentsDAO.createReferents(cr);
		cr.setName("Рольового руху");
		referentsDAO.createReferents(cr);
		cr.setName("Сноубординг та лещетарство");
		referentsDAO.createReferents(cr);
		cr.setName("Спортивна");
		referentsDAO.createReferents(cr);
		
	}
	public static void main(String[] args) {
		InsertCampsReferents icr = new InsertCampsReferents();
		icr.addReferents();
	}
}
